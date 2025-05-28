package com.pppspringioc.ioc.environmentabstraction.beandefinitionprofiles.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

@Repository
public class SampleDao {

    private final DataSource dataSource;

    public SampleDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void testConnection() {
        try (Connection conn = dataSource.getConnection()) {
            System.out.println("✔ DB 연결 성공: " + conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}