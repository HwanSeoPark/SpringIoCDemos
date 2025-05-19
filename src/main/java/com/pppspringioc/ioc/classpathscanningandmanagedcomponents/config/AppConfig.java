package com.pppspringioc.ioc.classpathscanningandmanagedcomponents.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "com.intheeast.ioc.classpathscanningandmanagedcomponents",
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = com.pppspringioc.ioc.classpathscanningandmanagedcomponents.qualifier.Offline.class),
        excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*Comedy.*Repository"),
        scopeResolver = MyScopeResolver.class
)
public class AppConfig {
}
