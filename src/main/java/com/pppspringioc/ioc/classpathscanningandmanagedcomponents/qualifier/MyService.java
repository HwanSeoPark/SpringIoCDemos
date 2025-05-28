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
// 여기서의 value()는 @Component의 value()와 같은 의미다
}
