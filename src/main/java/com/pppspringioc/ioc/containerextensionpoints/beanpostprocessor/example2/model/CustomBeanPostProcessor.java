package com.pppspringioc.ioc.containerextensionpoints.beanpostprocessor.example2.model;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class CustomBeanPostProcessor implements BeanPostProcessor, Ordered {

	@Override
	public int getOrder() {
		
		return 0; // <-- 작은 순번일수록 먼저 실행
	}
	
	
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        if (bean instanceof ExampleBean) {
            ExampleBean exampleBean = (ExampleBean) bean;
            System.out.println("CustomBeanPostProcessor - Before Initialization: " + beanName);
            exampleBean.setMessage(exampleBean.getMessage() + " [Modified by CustomBeanPostProcessor]");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        if (bean instanceof ExampleBean) {
            System.out.println("CustomBeanPostProcessor - After Initialization: " + beanName);
        }
        return bean;
    }

	
}
