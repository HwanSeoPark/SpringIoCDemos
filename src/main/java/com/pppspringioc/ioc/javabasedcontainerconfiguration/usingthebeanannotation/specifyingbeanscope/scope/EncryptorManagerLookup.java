package com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope.scope;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class EncryptorManagerLookup {

	public void process(String data) {
		Encryptor encryptor = getEncryptor();  // 매번 새 Encryptor
		encryptor.encrypt(data);
	}

	// @Lookup은 런타임 시, Spring이 CGLIB을 통해 구현체를 자동으로 생성하여 
	// getEncryptor() 호출 시 매번 새 Encryptor 빈을 주입합니다.
	// 매번 prototype 빈을 생성함
	@Lookup
	protected Encryptor getEncryptor() {
		return null; 
		// @Lookup 어노테이션을 통해
		// null값을 return하지 않고
		// 매번 새로운 빈을 생성해서 리턴함
	}
}