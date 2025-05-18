package com.pppspringioc.ioc.beanoverview.service;

import com.pppspringioc.ioc.beanoverview.dao.AccountDao;

public class PetStoreService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void addAccount(String account) {
        System.out.println("Adding account in PetStoreService: " + account);
        accountDao.saveAccount(account);
    }
}