package com.pppspringioc.ioc.dependencies.dependenciesandconfiguration.idref.service;

public class ManagerBean {

	private TargetBean targetBean;
	private ClientBean clientBean;
	
	public void setTargetBean(TargetBean targetBean) {
		this.targetBean = targetBean;
	}

	public void setClientBean(ClientBean clientBean) {
		this.clientBean = clientBean;
	}

	public TargetBean getTargetBean() {
		return targetBean;
	}

	public ClientBean getClientBean() {
		return clientBean;
	}

	
	
}
