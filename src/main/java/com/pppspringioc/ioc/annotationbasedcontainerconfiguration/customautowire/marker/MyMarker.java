package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.customautowire.marker;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyMarker {
}
