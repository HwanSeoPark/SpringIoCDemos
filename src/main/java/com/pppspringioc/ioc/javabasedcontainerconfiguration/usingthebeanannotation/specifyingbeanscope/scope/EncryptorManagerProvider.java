package com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope.scope;

import org.springframework.beans.factory.ObjectFactory;


public class EncryptorManagerProvider {

	private final ObjectFactory<Encryptor> encryptorFactory;

	public EncryptorManagerProvider(ObjectFactory<Encryptor> encryptorFactory) {
		this.encryptorFactory = encryptorFactory;
	}

	public void process(String data) {
		Encryptor encryptor = encryptorFactory.getObject();  // 매번 새 Encryptor
		encryptor.encrypt(data);
	}
}