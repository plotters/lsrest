/**
 * 
 */
package com.legalsounds.social;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;

import com.legalsounds.social.FacebookSupport.JSONKeys;
import com.webobjects.foundation.NSMutableSet;

public class FacebookPersonBuilder {

	private static final Logger log = Logger
			.getLogger(FacebookPersonBuilder.class);

	public FacebookPersonBuilder(String accessToken) throws Exception {
		// FIXME: replace with AOP injection for loggers
		log.info("Instantiating"
				+ FacebookPersonBuilder.class.getCanonicalName());
		
		currentAccessToken = accessToken;
		
		String url = FacebookSupport.ACCESS_TOKEN_RESEND_URL + currentAccessToken;

		log.info("Try to authenticate facebook user with " + currentAccessToken);
		String jsonString = null;
		if ((jsonString = JSONCustomUtilities.getJSONStringFromURL(url)) == null) {
			throw new Exception("JSON ERROR: Unknown");
		}

		JSONObject jsonObject = JSONObject.fromObject(jsonString);
		String error = (String) jsonObject.get(JSONKeys.error.name());
		if (error != null) {
			 throw new Exception(error);
		} else {
			userId = jsonObject.getString(JSONKeys.id.name());
			firstName = jsonObject.getString(JSONKeys.first_name.name());
			lastName = jsonObject.getString(JSONKeys.last_name.name());
			email = jsonObject.getString(JSONKeys.email.name());
		}
	}

	private String currentAccessToken;

	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	private String pictureURL;

	private NSMutableSet<FacebookPerson> friends;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPictureURL() {
		return pictureURL;
	}

	public void setPictureURL(String pictureURL) {
		this.pictureURL = pictureURL;
	}

	public NSMutableSet<FacebookPerson> getFriends() {
		return friends;
	}

	public void setFriends(NSMutableSet<FacebookPerson> friends) {
		this.friends = friends;
	}

	public String getCurrentAccessToken() {
		return currentAccessToken;
	}

	public void setCurrentAccessToken(String currentAccessToken) {
		this.currentAccessToken = currentAccessToken;
	}

	public FacebookPerson build() {
		FacebookPerson facebookPerson = new FacebookPerson();
		return facebookPerson;
	}

}
