package com.pppspringioc.ioc.environmentabstraction.beandefinitionprofiles.config;

import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.embedded.*;

import javax.sql.DataSource;

@Configuration
@Profile("dev") // dev -> development 약자
public class DevDataSourceConfig {

    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.HSQL)
                .addScript("classpath:my-schema.sql")
                .addScript("classpath:my-test-data.sql")
                .build();
    }
}