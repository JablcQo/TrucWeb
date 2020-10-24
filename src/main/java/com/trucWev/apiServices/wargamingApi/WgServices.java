package com.trucWev.apiServices.wargamingApi;

import org.springframework.web.client.RestTemplate;

import com.trucWev.apiServices.wargamingApi.wargamingApiConstants.WgPlayerStatisticsUrlGen;

public class WgServices {

	public WgServices() {
		/* do we want anything in constructor?? */
	}
	
	public String ObtainAccountInformation(String userName,String server) {
		String accountUrl = WgPlayerStatisticsUrlGen.GetPlayerIdUrl(userName, server);
		RestTemplate template = new RestTemplate();
		return template.getForEntity(accountUrl, String.class).toString();
	}
}
