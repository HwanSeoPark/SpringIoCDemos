package com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.threadsafety;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.threadsafety.config.AppConfig;
import com.pppspringioc.ioc.customizingnatureofbean.lifecyclecallbacks.threadsafety.model.ExampleSingletonBean;

public class Main {

    public static void main(String[] args) {
        // Spring ApplicationContext 생성
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        // ExampleSingletonBean 가져오기
        ExampleSingletonBean bean = context.getBean(ExampleSingletonBean.class);

        // 여러 스레드에서 실행
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                bean.incrementCounter();
                try {
                    Thread.sleep(100); // 간격 추가
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final Counter Value: " + bean.getCounter());

        // 컨텍스트 종료
        context.close(); // 파괴 콜백 실행
    }
}
