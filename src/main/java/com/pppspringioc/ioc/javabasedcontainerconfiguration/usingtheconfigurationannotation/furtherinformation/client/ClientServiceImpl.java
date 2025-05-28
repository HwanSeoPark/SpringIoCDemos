package com.pppspringioc.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.furtherinformation.client;

public class ClientServiceImpl implements ClientService {
	private ClientDao clientDao;

	public void setClientDao(ClientDao clientDao) {
		this.clientDao = clientDao;
	}

	@Override
	public void process() {
		System.out.println("🧩 ClientServiceImpl 처리 중: " + this);
		clientDao.save();
	}
}
