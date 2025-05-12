package com.pppspringioc.ioc.containeroverview.dao.jpa;

import com.pppspringioc.ioc.containeroverview.dao.AccountDao;

public class JpaAccountDao implements AccountDao {

	@Override
    public void saveAccount(String account) {
        System.out.println("Saving account to the database: " + account);
    }

    @Override
    public String getAccount(String accountId) {
        System.out.println("Fetching account from the database with ID: " + accountId);
        return "Account_" + accountId; // Dummy data
    }
}
