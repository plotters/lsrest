/**
 * 
 */
package com.legalsounds.social;

public interface FQLSupport {

	
	//TODO: rewrite with builder pattern and parameters
	public static final String FRIENDS_QUERY = "SELECT uid, first_name, last_name, pic_small "
			+ "FROM user "
			+ "WHERE uid "
			+ "IN"
			+ " ("
			+ "SELECT uid1 "
			+ "FROM friend " + "WHERE uid2=me()" + ") " + "ORDER BY name ASC LIMIT {0},{1}";
	
	public static final String FRIENDS_QUERY_fake =
			"SELECT uid, first_name, last_name, pic_small FROM user WHERE uid IN (SELECT uid1 FROM friend WHERE uid2=me()) ORDER BY name ASC";
}
