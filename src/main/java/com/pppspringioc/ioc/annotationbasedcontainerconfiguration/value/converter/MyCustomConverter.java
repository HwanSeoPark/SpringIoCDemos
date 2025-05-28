package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.value.converter;

import org.springframework.core.convert.converter.Converter;

/**
 * 예: "abc" 문자열을 SomeCustomType으로 변환하는 예시
 */
public class MyCustomConverter implements Converter<String, SomeCustomType> {
	
	@Override
	public SomeCustomType convert(
			String source) {
		return new SomeCustomType(source);
	}
}
