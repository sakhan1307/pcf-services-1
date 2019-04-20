package com.way2learnonline;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;


@SpringBootApplication
@EnableDiscoveryClient
public class AccountsApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}
	
	
	
	/*@Value("classpath:scripts.sql")
	private Resource scripts;
	
	@Bean
	@Profile("cloud")
	public DataSourceInitializer initializer(DataSource dataSource){
		
		System.err.println("AccountsApplication.initializer()");
		
		DataSourceInitializer initializer= new DataSourceInitializer();
		initializer.setDataSource(dataSource);
		
		ResourceDatabasePopulator populator= new ResourceDatabasePopulator(scripts);
		
		initializer.setDatabasePopulator(populator);
		
		return initializer;
		
	}
*/}
