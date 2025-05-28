package com.pppspringioc.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.furtherinformation.client;


public class ClientDaoImpl implements ClientDao {
	public ClientDaoImpl() {
		System.out.println("📦 ClientDaoImpl 생성됨: " + this);
	}

	@Override
	public void save() {
		System.out.println("✅ ClientDaoImpl 저장 로직 호출됨");
	}
}
