package com.pppspringioc.ioc.classpathscanningandmanagedcomponents.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface Online {
// 사용자 어노테이션을 만듬
// 근데 @Component 어노테이션이 없음
}
