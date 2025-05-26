package com.pppspringioc.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingImportannotation.imports;

import org.springframework.stereotype.Component;

@Component
public class MyService {
	public void performService() {
		System.out.println("🛠️ MyService: 서비스 실행 중...");
	}
}
