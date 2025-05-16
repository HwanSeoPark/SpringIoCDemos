package com.pppspringioc.ioc.dependencies.dependenciesandconfiguration.idref.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

// Bean 자신을 생성하고 등록하는 Spring IoC컨테이너로부터
// Spring IoC 컨테이너가 누구인지를 알고 시을 때 구현하는 인터페이스....
// 이 인터페이스를 구현하는 것은, 예들 들어 해당 객체가 함께 동작하는 여러 빈(Bean)들에 접근해야 할 때 의미가 있습니다
// 단, 단순비 빈을 조회하기 위한 목적이라면 이 인터페이스를 구현하는 것보다 빈 참조를 통한 설정 방식이 더 바람직합니다.

public class ClientBean implements ApplicationContextAware {
    private String targetName;
    private TargetBean targetBean;
    private ApplicationContext applicationContext;

    // ApplicationContext 주입
    // 그럼 결국 setApplicationContext도 Spring IoC 컨테이너가 호출하기 때문에,
    // 이것 또한 Dependency INjection? : DI는 Spring ICO 컨테이너에 의해 수행됨
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
        if (targetName != null) {
            this.targetBean = (TargetBean) applicationContext.getBean(targetName);
        }
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
        if (applicationContext != null) {
            this.targetBean = (TargetBean) applicationContext.getBean(targetName);
        }
    }

    public TargetBean getTargetBean() {
        return targetBean;
    }

    public String getTargetName() {
        return targetName;
    }
}