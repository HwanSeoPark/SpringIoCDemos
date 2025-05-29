package com.pppspringioc.ioc.classpathscanningandmanagedcomponents.qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

/*
 public @interface Component {
	String value() default "";
}
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface MyService {
	@AliasFor(annotation = Component.class, attribute = "value")	
	String value() default "";
	// value()라는 속성을 만들었는데
	// 만들어진 value()라는 속성을 특정 속성으로 쓰고 싶을 때
	// @AliasFor()로 특정 속성의 value라고 설정할 수있음
	// 그래서 
	// 여기서의 value()는 @Component의 value()와 같은 의미다
}
