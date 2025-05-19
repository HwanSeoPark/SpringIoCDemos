package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.customautowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.customautowire.config.AppConfig;
import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.customautowire.service.MyConsumer;

public class Main {
    public static void main(String[] args) {

        // 스프링 컨텍스트 초기화 (Java Config)
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // @Component 스캔된 MyConsumer 빈을 가져오기
        MyConsumer consumer = ctx.getBean(MyConsumer.class);

        // 테스트 실행
        consumer.test();

        ctx.close();
    }
}
