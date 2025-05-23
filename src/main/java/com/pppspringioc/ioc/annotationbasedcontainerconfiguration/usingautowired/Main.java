package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired;


import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.config.AppConfig;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.config.SelfInjectionBean;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.service.MovieRecommender;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.service.MultipleCatalogConsumer;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.service.MultipleConstructorsBean;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.service.OptionalInjectionBean;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.service.SimpleMovieLister;

public class Main {

	// Wrapping... 
	// 참조 변수가 null을 가질 수가 있는데,
	// 만약 참조 변수가 null일 때, 이 참조 변수에 엑세스 멤버 연산자를 사용할 경우
	// NullPointException이 발생함...
	// : 사전에 예방할 수 있도록 참조 변수를 wrapping한다... 
	public static Optional<String> findNameById(int id) {
		if (id == 1) {
			// of 메서드에게 전달되는 것은 "홍길동"이라는 문자열 리터럴인가요?
			// : "홍길동" 문자열 리터럴을 위해서 만들어진 String 클래스 인스턴스에 대한 참조값이 전달
			return Optional.of("홍길동"); // 같이 있을 때
		} else {
			return Optional.empty(); // 값이 없을 때
		}
	}
	
	
    public static void main(String[] args) {
    	
    	Optional<String> nameOpt = findNameById(1);
    	// findNameById(0)이면 value 값에 null 값이 들어감    	
    	if(!nameOpt.isEmpty()) {
    		String name = nameOpt.get();
    	}else {
    		
    	} // 보통 이렇게 많이 쓴다
    	
    	nameOpt.ifPresent(name -> System.out.println("이름:" + name));
    	/*
    	  public void ifPresent(Consumer<? super T> action) {
        if (value != null) {
            action.accept(value); // accept는 Consumer의 가상메서드
        	}
    	}
    	*/
    	// accept 메서드를 쓰면 이렇게 된다
//    	void accept(String name) {
//    		System.out.println("이름:" + name);
//    	}
    	
    	   	
    	// 값이 없으면 기본값 사용    
    	String name = nameOpt.orElse("이름없음");
    	
    	try {
    		String mustExistName = nameOpt.orElseThrow(()-> new IllegalArgumentException("이름이 존재하지 않습니다"));
    		System.out.println("필수 이름 :" + mustExistName);		
    	} catch(IllegalArgumentException e) {
    		System.out.println(e.getMessage());
    	}
    	/* orElseThrow타고 들어가면
    	 // T : Optional Class의 타입 변수 -> String    	 
    	 // <X extends Throwable> : 제너릭 메서드의 타입 파라미터(타입 파라미터 상한제한)  
    	 // Supplier<? extends X> exceptionSupplier : 이 파라미터에 제공될 아규먼트에 대한 와일드카드 상한제한
    	 public <X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier) throws X {
        if (value != null) {
            return value;
        } else {
            throw exceptionSupplier.get();
        	}
    	}
    	 */ //throw exceptionSupplier.get();이 get이 아래처럼 변함
/////////////////////////////////////////////////////////    	
//    	public interface Supplier<T> {    
//    	    T get();
//    	}  	
    	// ↓ 이렇게 변함 아래 메서드를 보고
//    	IllegalArgumentException get() {
//    		return new IllegalArgumentException("이름이 존재하지 않음");
//    	}    	
    	String mustExistName =
    			nameOpt.orElseThrow(() -> new IllegalArgumentException("이름이 존재하지 않음"));
//////////////////////////////////////////////////////////////    	
    	
    	// 1) Java 기반 설정 클래스(AppConfig)를 이용한 ApplicationContext 로딩
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(AppConfig.class);

        // 2) SimpleMovieLister 테스트 (Setter 주입)
        SimpleMovieLister lister = context.getBean(SimpleMovieLister.class);
        lister.listMovies();

        // 3) MovieRecommender 테스트 (생성자, 필드, 임의 메서드 주입)
        MovieRecommender recommender = context.getBean(MovieRecommender.class);
        recommender.recommendMovie();

        // 4) 배열, 컬렉션, 맵 주입 예시
        MultipleCatalogConsumer catalogConsumer = context.getBean(MultipleCatalogConsumer.class);
        catalogConsumer.printCatalogs();

        // 5) MultipleConstructorsBean 테스트
        MultipleConstructorsBean multipleConstructorsBean = context.getBean(MultipleConstructorsBean.class);
        multipleConstructorsBean.doSomething();

        // 6) OptionalInjectionBean 테스트
        OptionalInjectionBean optionalBean = context.getBean(OptionalInjectionBean.class);
        optionalBean.printOptionalField();

        // 7) Self Injection 테스트
        SelfInjectionBean selfBean = context.getBean(SelfInjectionBean.class);
        selfBean.outerMethod();

        context.close();
    }
}
