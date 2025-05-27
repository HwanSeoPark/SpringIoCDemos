package com.pppspringioc.ioc.environmentabstraction.usingpropertysourceannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
        // 스프링 컨테이너 생성
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // TestBean 가져오기
        TestBean testBean = context.getBean(TestBean.class);
        System.out.println("✔ testBean.getName(): " + testBean.getName());

        context.close();
    }

}
