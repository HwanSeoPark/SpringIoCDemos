package com.pppspringioc.ioc.classpathscanningandmanagedcomponents.qualifier;

import org.springframework.core.annotation.AliasFor;

public @interface MyAnno {
	// 여기서의 별칭은
	// name은 value고
	// value은 name이다
	@AliasFor(attribute="name")
	String value() default "";
    
	@AliasFor(attribute="value")
	String name() default "";


}
