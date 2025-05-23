package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.finder.MovieFinder;

@Component
public class MultipleConstructorsBean {

    private MovieFinder movieFinder; // MovieFinder 구체를 필요로함

    // 1) 디폴트 생성자 (required=false가 아님)
    //   - 단 하나의 생성자만 정의되었다면 @Autowired가 없어도 자동 주입이 되지만
    //     여기서는 여러 생성자가 있으므로 구분이 필요.
    public MultipleConstructorsBean() {
        System.out.println("[MultipleConstructorsBean] Default constructor called");
    }

    // 2) 주입 가능한 생성자 (required=true)
    @Autowired(required = true) // required은 디폴트로 ture라 (required = true) 안적어도 된다
    public MultipleConstructorsBean(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
        System.out.println("[MultipleConstructorsBean] Autowired constructor called with MovieFinder");
    }

    // 3) 다른 생성자 (required=false)
    // Declares whether the annotated dependency is required.
//  @Autowired //(required = false)
//    public MultipleConstructorsBean(
//    		@Qualifier("movieFinder1")MovieFinder finder1, @Qualifier("movieFinder2")MovieFinder finder2) {
//        // 만약 MovieFinder 타입 빈이 1개밖에 없으면 이 생성자는 충족 불가 -> 이 생성자는 사용되지 않음
//    	// 이떄 해결하는 방법이 @Qualifier
//        System.out.println("[MultipleConstructorsBean] Overloaded constructor with 2 finders called");
//    }
    @Autowired(required = false) // 전달할 아규먼트가 빈으로 컨테이너에 등록되지 않으면,
    							 // 이 컨스트럭터는 호출되지 않는다!!! 라는 의미
    							 // 현 클래스에서는 이런 상황일 때, 디폴트 컨스트럭터가 대신 호출됨.
    public MultipleConstructorsBean(
    		MovieFinder finder1,MovieFinder finder2) {
        // 만약 MovieFinder 타입 빈이 1개밖에 없으면 이 생성자는 충족 불가 -> 이 생성자는 사용되지 않음    	
        System.out.println("[MultipleConstructorsBean] Overloaded constructor with 2 finders called");
    }
    
    public void doSomething() {
        if (movieFinder != null) {
            System.out.println("[MultipleConstructorsBean] Using movieFinder: " + movieFinder.findAll());
        } else {
            System.out.println("[MultipleConstructorsBean] No movieFinder is injected");
        }
    }
}