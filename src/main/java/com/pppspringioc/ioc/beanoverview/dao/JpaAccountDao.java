package com.pppspringioc.ioc.beanoverview.dao;


public class JpaAccountDao implements AccountDao {
    @Override
    public void saveAccount(String account) {
        System.out.println("Account saved: " + account);
    }
}
