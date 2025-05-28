package com.pppspringioc.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.lookupmethodinjection.model;

import org.springframework.beans.factory.annotation.Lookup;

public abstract class CommandManager {

	public Object process(Object commandState) {
		Command command = createCommand();  // 매번 새로운 프로토타입
		command.setState(commandState);
		return command.execute();
	}

	// 반드시 오버라이드해야 함
	@Lookup
	protected abstract Command createCommand();
}
