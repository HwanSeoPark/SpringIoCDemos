package com.pppspringioc.ioc.classpathscanningandmanagedcomponents.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ScopeMetadata;
import org.springframework.context.annotation.ScopeMetadataResolver;

public class MyScopeResolver implements ScopeMetadataResolver {
	
	@Override
    public ScopeMetadata resolveScopeMetadata(BeanDefinition definition) {
        ScopeMetadata scopeMetadata = new ScopeMetadata();

        // 특정 조건에 따라 스코프를 설정
        // 지금 조건은 Service가 끝에 있을경우 프로토타입
        // 없을경우 싱글톤으로 스코프 설정
        String beanClassName = definition.getBeanClassName();
        if (beanClassName != null && beanClassName.endsWith("Service")) {
            scopeMetadata.setScopeName("prototype");
        } else {
            scopeMetadata.setScopeName("singleton");
        }

        return scopeMetadata;
    }
}
