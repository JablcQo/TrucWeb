package com.trucWev.apiServices.wargamingApi.wargamingApiConstants;

public class WgPlayerStatisticsUrlGen {

	/*Can be generated for single player !only! to obtain account_id*/
	public static String GetPlayerIdUrl(String PlayerName,String Realm) {
		StringBuilder sb = new StringBuilder();
		sb.append(WGPlayerStatisticsConstants.PlayerIdByNameUrl);
		sb.append("?application_id=");
		sb.append(GlobalWgConstants.ApplicationId);
		sb.append("&search=");
		sb.append(PlayerName);
		sb.append("&r_realm=");
		sb.append(Realm);
		return sb.toString();
	}
}
