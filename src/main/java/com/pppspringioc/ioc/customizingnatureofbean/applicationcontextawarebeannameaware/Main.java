package com.pppspringioc.ioc.customizingnatureofbean.applicationcontextawarebeannameaware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.customizingnatureofbean.applicationcontextawarebeannameaware.config.AppConfig;
import com.pppspringioc.ioc.customizingnatureofbean.applicationcontextawarebeannameaware.model.CustomAwareBean;

public class Main {

    public static void main(String[] args) {
        // Spring ApplicationContext 생성
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        // CustomAwareBean 가져오기
        CustomAwareBean awareBean = context.getBean(CustomAwareBean.class);

        // ApplicationContext 및 BeanName 확인
        awareBean.printBeanDetails();

        // 컨텍스트 종료
        context.close();
    }
}

