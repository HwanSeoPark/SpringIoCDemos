package com.pppspringioc.ioc.dependencies.dependenciesandconfiguration.idref.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pppspringioc.ioc.dependencies.dependenciesandconfiguration.idref.service.ClientBean;
import com.pppspringioc.ioc.dependencies.dependenciesandconfiguration.idref.service.ManagerBean;
import com.pppspringioc.ioc.dependencies.dependenciesandconfiguration.idref.service.TargetBean;

@Configuration
public class AppConfig {
	
	@Bean
    public TargetBean theTargetBean() {
        return new TargetBean();
    }

    @Bean
    public ClientBean theClientBean(/*TargetBean targetBean*/) {
        ClientBean client = new ClientBean();
//        client.setTargetName(targetBean.getClass().getSimpleName()); // Bean 이름 설정
        client.setTargetName("theTargetBean");
        return client;
    }
	
    @Bean
    public ManagerBean theManagerBean() {
    	ManagerBean managerBean = new ManagerBean();
    	managerBean.setTargetBean(theTargetBean());
    	managerBean.setClientBean(theClientBean());
    	return managerBean;
    }
    


}