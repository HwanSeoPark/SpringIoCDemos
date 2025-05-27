package com.pppspringioc.ioc.classpathscanningandmanagedcomponents.qualifier;

import org.springframework.core.annotation.AliasFor;

public @interface MyAnno {

	@AliasFor(attribute="name")
	String value() default "";
    
	@AliasFor(attribute="value")
	String name() default "";
}
