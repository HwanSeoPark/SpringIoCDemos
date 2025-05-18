package com.pppspringioc.ioc.dependencies.requiredprototypebean.service;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

	private final ObjectFactory<PrototypeBean> objFactory;
	private int counts = 0;
	
	@Autowired
	public SingletonBean(ObjectFactory<PrototypeBean> objFactory) {
		this.objFactory = objFactory;
	}


	public void doExcute() {
		// PrototypeBean의 scope가 prototype 이라는 것을 모른다고 가정.
		PrototypeBean prototypeBean = this.objFactory.getObject();
		counts = prototypeBean.getCount();
		System.out.println("doExcute: counts = " + counts);
	}
	
}
