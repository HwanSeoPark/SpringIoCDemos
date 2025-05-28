package com.pppspringioc.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingautowiredinconfigurationclass.domain;

import javax.sql.DataSource;

public class JdbcAccountRepository implements AccountRepository {

	private final DataSource dataSource;

	public JdbcAccountRepository(DataSource dataSource) {
		this.dataSource = dataSource;
		System.out.println("✅ JdbcAccountRepository 생성됨: " + dataSource);
	}

	@Override
	public void updateAccount(String accountNumber, double amount) {
		System.out.println("💾 " + accountNumber + " 계좌에 " + amount + " 업데이트 수행 (JDBC)");
	}
}
