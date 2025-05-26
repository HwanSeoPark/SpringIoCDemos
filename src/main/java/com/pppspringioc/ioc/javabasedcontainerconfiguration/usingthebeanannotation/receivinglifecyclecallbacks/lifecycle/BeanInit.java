package com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.receivinglifecyclecallbacks.lifecycle;

import org.springframework.beans.factory.InitializingBean;

// 빈의 생성된 이후에 이 빈이 InitializingBean을 구현했기 때문에
// InitializingBean의 메서드를 실행
public class BeanInit implements InitializingBean {
	public BeanInit() {
		System.out.println("1️. BeanInit 생성자 호출");
	}

	@Override
	public void afterPropertiesSet() {
		System.out.println("2️. BeanInit - InitializingBean.afterPropertiesSet()");
	}

	// afterPropertiesSet() 메서드 호출 후에 실행되는걸 볼수있음
	public void customInit() {
		System.out.println("3️. BeanInit - 사용자 정의 init-method 실행");
	}
}
