package com.pppspringioc.ioc.containeroverview.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.containeroverview.dao.jpa.JpaAccountDao;
import com.pppspringioc.ioc.containeroverview.dao.jpa.JpaItemDao;

// @Configuration
public class DaoConfig {

 //   @Bean
    public JpaAccountDao accountDao() {
        // JpaAccountDao에 필요한 설정을 추가할 수 있습니다.
        return new JpaAccountDao();
    }

 //   @Bean
    public JpaItemDao itemDao() {
        // JpaItemDao에 필요한 설정을 추가할 수 있습니다.
        return new JpaItemDao();
    }

    // 필요한 다른 DAO Bean을 정의합니다.
}