package com.way2learnonline.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.cloud.servicebroker.model.CreateServiceInstanceAppBindingResponse;
import org.springframework.cloud.servicebroker.model.CreateServiceInstanceBindingRequest;
import org.springframework.cloud.servicebroker.model.CreateServiceInstanceBindingResponse;
import org.springframework.cloud.servicebroker.model.DeleteServiceInstanceBindingRequest;
import org.springframework.cloud.servicebroker.service.ServiceInstanceBindingService;
import org.springframework.stereotype.Component;

@Component
public class MySqlServiceInstanceBindingService implements ServiceInstanceBindingService {

	@Override
	public CreateServiceInstanceBindingResponse createServiceInstanceBinding(
			CreateServiceInstanceBindingRequest request) {
		System.out.println("MySqlServiceInstanceBindingService.createServiceInstanceBinding()");
		
		Map<String, Object> credentials = new HashMap<String,Object>();
				credentials.put("hostname", "sivahost");
				credentials.put("username", "siva");
				credentials.put("password", "secret");
				
		return new CreateServiceInstanceAppBindingResponse().withCredentials(credentials);
	}

	@Override
	public void deleteServiceInstanceBinding(DeleteServiceInstanceBindingRequest request) {
		System.out.println("MySqlServiceInstanceBindingService.deleteServiceInstanceBinding()");

	}

}
