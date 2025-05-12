package com.pppspringioc.ioc.containeroverview.dao.jpa;

import com.pppspringioc.ioc.containeroverview.dao.ItemDao;

public class JpaItemDao implements ItemDao {

	@Override
    public void saveItem(String item) {
        System.out.println("Saving item to the database: " + item);
    }

    @Override
    public String getItem(String itemId) {
        System.out.println("Fetching item from the database with ID: " + itemId);
        return "Item_" + itemId; // Dummy data
    }
}
