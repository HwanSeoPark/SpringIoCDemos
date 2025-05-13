package com.pppspringioc.ioc.beanoverview.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.pppspringioc.ioc.beanoverview.dao.DataSource;



// Java 기반 구성 메타데이터
@Configuration
public class AliasConfig {

	/* xml 기반의 구성 메타데이터...
	<bean id="dataSource" class="com.intheeast.ioc.beanoverview.config.DataSource"
		name="dataSourceName"> 
	*/ 
    @Bean(name = {"primaryDataSource", 
    		"subsystemA-dataSource", 
    		"subsystemB-dataSource"})
    @Primary
    public DataSource dataSource() { // id는 팩토리 메서드 이름인, dataSource입니다...
        // id가 있기도 하고, 없기도 하다?...
        // BeanDefintion의 name 필드[String[]]에
        // Bean 이름을 저장합니다...
        // 다수의 이름을 가질 수 있음...
//BeanDefinition bf;
    	return new DataSource();
    	}
	
}
