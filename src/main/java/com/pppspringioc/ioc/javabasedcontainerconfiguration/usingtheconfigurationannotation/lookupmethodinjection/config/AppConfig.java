package com.pppspringioc.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.lookupmethodinjection.config;

import org.springframework.context.annotation.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

import com.pppspringioc.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.lookupmethodinjection.model.*;

@Configuration
public class AppConfig {

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public AsyncCommand asyncCommand() {
	    System.out.println("asyncCommand()");
		return new AsyncCommand();
	}

	@Bean
	public CommandManager commandManager() {
		// 익명 내부 클래스로 Lookup Method Injection
		return new CommandManager() {
			@Override
			protected Command createCommand() {
				return asyncCommand();  // 매번 새로운 AsyncCommand 반환
				// asasyncCommand() 메서드를 호출하는것 처럼 보이지만 호출하는 것은 아니다!!
				// Spring IoC 컨테이너에게 
				// 위에서 생성되는 asyncCommand() prototype 빈을 달라고 부탁 함
			}
		};
	}
}
