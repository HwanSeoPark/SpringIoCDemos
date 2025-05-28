package com.pppspringioc.ioc.javabasedcontainerconfiguration.composingjavabasedconfigurations.usingautowiredinconfigurationclass.domain;

public class TransferServiceImpl implements TransferService {

	private final AccountRepository accountRepository;

	public TransferServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
		System.out.println("✅ TransferServiceImpl 생성됨");
	}

	@Override
	public void transfer(double amount, String fromAccount, String toAccount) {
		System.out.println("🚀 이체 시작: " + amount + " from " + fromAccount + " to " + toAccount);
		accountRepository.updateAccount(fromAccount, -amount);
		accountRepository.updateAccount(toAccount, amount);
	}
}
