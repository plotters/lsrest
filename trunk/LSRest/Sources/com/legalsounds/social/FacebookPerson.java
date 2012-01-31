/**
 * 
 */
package com.legalsounds.social;

import java.net.URLEncoder;

import org.apache.log4j.Logger;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import com.legalsounds.social.FacebookSupport.JSONKeys;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSMutableSet;

public class FacebookPerson {
//
//	private static final Logger log = Logger.getLogger(FacebookPerson.class);
//	
//	private String currentAccessToken;
//
//	private final String userId;
//	private String firstName;
//	private String lastName;
//	private String email;
//	private String pictureURL;
//
//	private NSMutableSet<FacebookPerson> friends;
//
//	FacebookPerson(FacebookPersonBuilder builder) {
//		currentAccessToken = builder.getCurrentAccessToken();
//		userId = builder.getUserId();
//		firstName = builder.getFirstName();
//		lastName = builder.getLastName();
//		email = builder.getEmail();
//		pictureURL = builder.getPictureURL();
//		friends = builder.getFriends();
//	}
//
//	public NSMutableSet<FacebookPerson> getFriends() {
//
//		// TODO: do (rewrite) this with design patterns!
//
//		String url = FacebookSupport.FACEBOOK_GRAPH_BASE_URL
//				+ FacebookSupport.FQL
//				+ "?"
//				+ "q="
//				+ URLEncoder.encode(FQLSupport.FRIENDS_QUERY,
//						FacebookSupport.CODE_PAGE_STRING) + "&"
//				+ FacebookSupport.ACCESS_TOKEN_STRING + "="
//				+ currentAccessToken;
//
//		String jsonString = JSONCustomUtilities.getJSONStringFromURL(url);
//		
//		JSONObject jsonObject = (JSONObject) JSONSerializer.toJSON(jsonString);
//		
//		JSONArray jsonArray = jsonObject.getJSONArray(JSONKeys.data.name());
//
//		int jsonArrayLength = jsonArray.size();
//		friends = new NSMutableSet<FacebookPerson>(jsonArrayLength);
//		
//		for (int i = 0; i < jsonArrayLength; i++) {
//			FacebookPerson facebookPerson = new FacebookPerson();
//			jsonObject = (JSONObject) jsonArray.get(i);
//
//			userId = jsonObject.getString(JSONKeys.uid.name());
//			firstName = jsonObject.getString(JSONKeys.first_name.name());
//			lastName = jsonObject.getString(JSONKeys.last_name.name());
//			email = jsonObject.getString(JSONKeys.email.name());
//			pictureURL = jsonObject.getString(JSONKeys.pic_small.name());
//
//			friends.add(facebookPerson);
//		}
//
//		// TODO: implement this - now returns empty set
//		return new NSMutableSet<FacebookPerson>();
//	}

}
