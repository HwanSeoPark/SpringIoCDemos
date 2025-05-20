package com.pppspringioc.ioc.containerextensionpoints.beanfactorypostprocessor.example1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.containerextensionpoints.beanfactorypostprocessor.example1.config.AppConfig;
import com.pppspringioc.ioc.containerextensionpoints.beanfactorypostprocessor.example1.model.DataSource;
import com.pppspringioc.ioc.containerextensionpoints.beanfactorypostprocessor.example1.model.User;

public class Main {

	public static void builderPattern() {
//		User user = new User.Builder()
//				.setAge(10)
//				.setEmail(null)
//				.setId(1)
//				.setName("hello")
//				.setIsAdmin(false)
//				.build();
		// 빌드 패턴을 사용하는 장점은,
		// 컨스트럭터의 파라미터 리스트에 많은 파라미터가 정의된 경우,
		// 발생할 수 있는 잘못된 타입의 아규먼트 그리고 순서 실수를 
		// 방지할 수 있음
		// 그리고 전달하지 않은 아규먼트는 타입에 따른 디폴트 값으로 설정되어서
		// 해당 컨스트럭터에게 전달됨
		User user = User.builder()
				.age(10)
				.email("hello@gmail.com")
				.name("hello")
				.id(1)
				.isAdmin(false)
				.address("korea")
				.job("무직")
				.gender("male")
				.build();
		
		// getter 만든적 없지만 @Getter로 인해 컴파일때 만들어짐
		Integer age = user.getAge();
		String email = user.getEmail();		
		// setter도 @setter로 인해 자동으로 만들어짐
		user.setAge(20);
		
		System.out.println(user); // 실질적으로 println에게
		                          // toString의 리턴값이 아규먼트로 전달됨
		// lombok이 만든 toString을 다음과 같은 문자열을 만듦
		//User(id=1, name=hello, email=hello@gmail.com, age=20, isAdmin=false)
		
		User user2 = new User(); // 디폴트 컨스트럭터도 만들어짐
	}
	
	
    public static void main(String[] args) {

    	builderPattern();
    	
    	// ApplicationContext 생성
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        // DataSource 빈 가져오기
        DataSource dataSource = context.getBean(DataSource.class);
        System.out.println("Final DataSource: " + dataSource);

        // 컨텍스트 종료
        context.close();
    }
}
