package com.pppspringioc.ioc.beandefinitioninheritance.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.beandefinitioninheritance.model.DerivedTestBean;
import com.pppspringioc.ioc.beandefinitioninheritance.model.TestBean;

@Configuration
public class BeanInheritanceConfig {

	@Bean
    public static BeanDefinitionRegistryPostProcessor beanDefinitionInheritanceProcessor() {
        return new BeanDefinitionRegistryPostProcessor() {
            @Override
            public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

                // 부모 빈 정의 생성
                RootBeanDefinition parent = new RootBeanDefinition();
                parent.setBeanClass(TestBean.class);
                // setAbstract메서드에 true 아규먼트를 전달하면,
                // 템플릿 용도로만 사용되고 빈으로 생성되지 않습니다
                parent.setAbstract(true);
                parent.getPropertyValues().add("name", "parent");
                parent.getPropertyValues().add("age", 1);
                parent.setInitMethodName("init");

                registry.registerBeanDefinition("inheritedTestBean", parent);

                // 자식 빈 정의 생성
                GenericBeanDefinition child = new GenericBeanDefinition();
                child.setParentName("inheritedTestBean"); // 부모 이름 지정
                child.setBeanClass(DerivedTestBean.class);
                child.getPropertyValues().add("name", "override"); // 상속된 name을 override
                child.setInitMethodName("initialize");

                registry.registerBeanDefinition("inheritsWithDifferentClass", child);
            }

            @Override
            public void postProcessBeanFactory(org.springframework.beans.factory.config.ConfigurableListableBeanFactory beanFactory) throws BeansException {
                // 생략 가능
            }
        };
    }
}