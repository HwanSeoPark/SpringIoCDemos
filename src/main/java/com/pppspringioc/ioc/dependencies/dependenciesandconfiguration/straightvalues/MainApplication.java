package com.pppspringioc.ioc.dependencies.dependenciesandconfiguration.straightvalues;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pppspringioc.ioc.dependencies.dependenciesandconfiguration.straightvalues.config.AppConfig;


public class MainApplication {	
	
	public static void testPropertiesFile() {
		
		// Spring Framework 기반의 작업을 할때,
		// 직접적으로 Properties 클래스를 사용할 일은 거의 없을 것
		Properties properties = new Properties();

        // 클래스패스 기준으로 properties 파일 읽기
		// try resource catch
        try (BufferedInputStream inputStream = 
        		(BufferedInputStream) MainApplication.class.
        		getClassLoader().getResourceAsStream("config.properties")) {

            if (inputStream == null) {
                System.out.println("config.properties 파일을 찾을 수 없습니다.");
                return;
            }

            // Properties 로드
            properties.load(inputStream);

            // 값 읽기
            String appName = properties.getProperty("app.name");
            String appVersion = properties.getProperty("app.version");
            String appAuthor = properties.getProperty("app.author");
                        

            // 출력
            System.out.println("App Name    : " + appName);
            System.out.println("App Version : " + appVersion);
            System.out.println("App Author  : " + appAuthor);

        } catch (IOException e) {
            e.printStackTrace();
        }
    
	}
	
	public static void main(String[] args) throws SQLException, IOException {
		
		testPropertiesFile();
	
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		DataSource dataSource = context.getBean(DataSource.class);
		
		System.out.println(dataSource.getConnection());
	}
}