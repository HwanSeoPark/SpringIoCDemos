package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.value.converter;


/**
 * 사용자 정의 타입 예시.
 * "abc" 같은 문자열을 래핑해 관리하거나
 * 특정 로직을 수행할 수 있습니다.
 */
public class SomeCustomType {

    private final String value;

    public SomeCustomType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    // toString 오버라이드
    @Override
    public String toString() {
        return "SomeCustomType{value='" + value + "'}";
    }
}
