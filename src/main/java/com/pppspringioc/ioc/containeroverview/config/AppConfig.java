package com.pppspringioc.ioc.containeroverview.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.pppspringioc.ioc.containeroverview.dao.AccountDao;
import com.pppspringioc.ioc.containeroverview.dao.ItemDao;
import com.pppspringioc.ioc.containeroverview.dao.jpa.JpaAccountDao;
import com.pppspringioc.ioc.containeroverview.dao.jpa.JpaItemDao;
import com.pppspringioc.ioc.containeroverview.service.PetStoreServiceImpl;

@Configuration
// @Import({ServiceConfig.class, DaoConfig.class})
public class AppConfig {
   
    @Bean
    public JpaAccountDao accountDao() {
        // JpaAccountDao에 필요한 설정을 추가할 수 있습니다.
        return new JpaAccountDao();
    }

    @Bean
    public JpaItemDao itemDao() {
        // JpaItemDao에 필요한 설정을 추가할 수 있습니다.
        return new JpaItemDao();
    }

    @Bean
    public PetStoreServiceImpl petStoreService(AccountDao accountDao, ItemDao itemDao) {
        PetStoreServiceImpl petStoreService = new PetStoreServiceImpl();
        petStoreService.setAccountDao(accountDao);
        petStoreService.setItemDao(itemDao);
        // 추가 설정이 있다면 여기에 작성
        return petStoreService;
    }    

}