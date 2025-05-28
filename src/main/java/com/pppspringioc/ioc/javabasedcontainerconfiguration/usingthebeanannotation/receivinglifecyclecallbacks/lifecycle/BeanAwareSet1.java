package com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.receivinglifecyclecallbacks.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class BeanAwareSet1 implements BeanNameAware, BeanFactoryAware {

	private String beanName;
	private BeanFactory beanFactory;

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
		System.out.println("7️. BeanAwareSet1 - BeanNameAware.setBeanName(): " + name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
		System.out.println("8️. BeanAwareSet1 - BeanFactoryAware.setBeanFactory()");
		
		// 이 빈이 싱글톤인지 확인해보기
		boolean isSingleton = this.beanFactory.isSingleton(beanName);
		System.out.println("🔍 [" + beanName + "] isSingleton = " + isSingleton);

		// 다른 빈을 수동으로 조회
		if (this.beanFactory.containsBean("beanInit")) {
			Object beanInit = this.beanFactory.getBean("beanInit");
			System.out.println("📦 BeanAwareSet1에서 'beanInit'을 수동으로 조회함: " + beanInit.getClass().getSimpleName());
		} else {
			System.out.println("❌ beanInit 빈이 존재하지 않음");
		}
	}
}
