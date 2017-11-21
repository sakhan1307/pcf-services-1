package com.way2learnonline.service;

import org.springframework.cloud.service.common.RelationalServiceInfo;
 
import org.springframework.cloud.service.ServiceInfo.ServiceLabel;

@ServiceLabel("sivamysql")
public class SivaMySqlInfo  extends RelationalServiceInfo{

	public SivaMySqlInfo(String id, String uriString, String jdbcUrlDatabaseType) {
		super(id, uriString, jdbcUrlDatabaseType);
		// TODO Auto-generated constructor stub
	}

}
