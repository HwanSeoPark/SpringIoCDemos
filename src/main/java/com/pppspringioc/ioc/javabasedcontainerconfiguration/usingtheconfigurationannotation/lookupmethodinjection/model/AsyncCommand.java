package com.pppspringioc.ioc.javabasedcontainerconfiguration.usingtheconfigurationannotation.lookupmethodinjection.model;

public class AsyncCommand implements Command {

	private Object state;

	public AsyncCommand() {
		System.out.println("🆕 AsyncCommand 생성됨: " + this.hashCode());
	}

	@Override
	public void setState(Object state) {
		this.state = state;
	}

	@Override
	public Object execute() {
		System.out.println("🚀 실행 중 - 상태: " + state);
		return "✅ 완료 with state: " + state;
	}
}