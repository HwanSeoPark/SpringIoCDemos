package com.pppspringioc.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingImportannotation.imports;

import org.springframework.stereotype.Component;

@Component
public class MyRepository {
	public void performRepositoryAction() {
		System.out.println("💾 MyRepository: 데이터 처리 중...");
	}
}
