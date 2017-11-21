package com.way2learnonline.service;


import org.springframework.cloud.cloudfoundry.RelationalServiceInfoCreator;
import org.springframework.cloud.cloudfoundry.Tags;

public class SivaMySqlInfoCreator extends RelationalServiceInfoCreator<SivaMySqlInfo> {



	public SivaMySqlInfoCreator() {
		super(new Tags("sivamysql"), "sivamysql");
		System.err.println("SivaMySqlInfoCreator.SivaMySqlInfoCreator()==============");
	}

	@Override
	public SivaMySqlInfo createServiceInfo(String id, String uri, String jdbcUrl) {
		System.err.println("SivaMySqlInfoCreator.createServiceInfo()===========");
		return new SivaMySqlInfo(id, uri, "sivamysql");
	}

}
