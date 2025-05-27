package com.pppspringioc.ioc.environmentabstraction.beandefinitionprofiles.config;

import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.naming.*;
import javax.sql.DataSource;

@Configuration
@Profile("prod") // prod -> production 약자
public class ProdDataSourceConfig {

    @Bean(destroyMethod = "")  // JNDI 관리 객체는 Spring이 종료 시 닫지 않음
    public DataSource dataSource() throws Exception {
    	SimpleDriverDataSource dataSource = new SimpleDriverDataSource();

        dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);  // MySQL 드라이버
        dataSource.setUrl("jdbc:mysql://localhost:3306/testdb?useSSL=false&serverTimezone=Asia/Seoul");
        dataSource.setUsername("root");
        dataSource.setPassword("1234");

        return dataSource;
    }
}
