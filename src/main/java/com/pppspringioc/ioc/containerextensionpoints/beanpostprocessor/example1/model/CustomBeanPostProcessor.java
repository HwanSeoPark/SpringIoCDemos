package com.pppspringioc.ioc.containerextensionpoints.beanpostprocessor.example1.model;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.StringUtils;

public class CustomBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        if (bean instanceof SimpleBean) {
            SimpleBean simpleBean = (SimpleBean) bean;

            // 빈 초기화 전 상태 확인 및 수정
            System.out.println("Before Initialization: Bean '" + beanName + "' has message: " + simpleBean.getMessage());
            if (!StringUtils.hasText(simpleBean.getMessage())) {
                simpleBean.setMessage("Default Message Set by BeanPostProcessor");
                System.out.println("Before Initialization: Message updated to default value.");
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        if (bean instanceof SimpleBean) {
            SimpleBean simpleBean = (SimpleBean) bean;

            // 빈 초기화 후 상태 확인 및 로그 출력
            System.out.println("After Initialization: Bean '" + beanName + "' has message: " + simpleBean.getMessage());

            // 특정 조건에 따라 동작 수행 (예: 로깅 추가)
            if (simpleBean.getMessage().contains("PostProcessor")) {
                System.out.println("After Initialization: Special logic applied to Bean '" + beanName + "'.");
            }
        }
        return bean;
    }
}
