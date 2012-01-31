package com.legalsounds.social;

public interface FacebookSupport {
	
    public static final String FQL = "fql";
	public static final String ACCESS_TOKEN_RESEND_URL = "https://graph.facebook.com/me?access_token=";
	public static final String ACCESS_TOKEN_STRING = "access_token";
	public static final String FACEBOOK_GRAPH_BASE_URL = "https://graph.facebook.com/";
	public static final String CODE_PAGE_STRING = "UTF-8";
	
	public static enum JSONKeys	{
		id, uid, first_name, last_name, email, pic_small, error, data,
	}
}
