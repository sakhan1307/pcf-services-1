package com.way2learnonline;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.cloud.servicebroker.model.Catalog;
import org.springframework.cloud.servicebroker.model.Plan;
import org.springframework.cloud.servicebroker.model.ServiceDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CatalogConfig {
	
	@Bean
	public Catalog catalog() {
		return new Catalog(Collections.singletonList(
				new ServiceDefinition("mphasis-mysql-service","mphasismysql",		
						"A simple MySql service broker implementation",	true,false,
						Collections.singletonList(
								new Plan("mphasis-mysql-free-plan","standard","This is a default MySql plan. ",
										getPlanMetadata(),
										true)),
						Arrays.asList("sivamysql", "document"),
						getServiceDefinitionMetadata(),
						null,
						null)));
	}
	
/* Used by Pivotal CF console */

	private Map<String, Object> getServiceDefinitionMetadata() {
		Map<String, Object> sdMetadata = new HashMap<>();
		sdMetadata.put("displayName", "MphasisMySqlDB");		
		sdMetadata.put("longDescription", "Mphasis MySql Service");
		sdMetadata.put("providerDisplayName", "Way2Learn");
		sdMetadata.put("providerDisplayName", "Way2Learn");
		
		return sdMetadata;
	}
	
	private Map<String,Object> getPlanMetadata() {
		Map<String,Object> planMetadata = new HashMap<>();
		planMetadata.put("bullets", getBullets());
		return planMetadata;
	}


	
	private List<String> getBullets() {
		return Arrays.asList("Shared Siva MySql server", 
				"100 MB Storage (not enforced)", 
				"40 concurrent connections (not enforced)");
	}
	
	
	
}
