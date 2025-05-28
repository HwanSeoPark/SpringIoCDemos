package com.pppspringioc.ioc.javabasedcontainerconfiguration.usingthebeanannotation.specifyingbeanscope.scope;

public class Encryptor {
	private final long id = System.nanoTime();  // 고유 식별자

	public void encrypt(String data) {
		System.out.println("🔐 Encryptor[" + id + "] encrypting: " + data);
	}
}