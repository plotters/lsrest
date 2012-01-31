package com.legalsounds.social;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.log4j.Logger;

import com.webobjects.foundation.NSMutableArray;

public class FQLQuery implements FQLQueryCommand {
	private static final Logger log = Logger.getLogger(FQLQuery.class);

	public FQLQuery(FQLQueryBuilder fqlQueryBuilder) {
		query = fqlQueryBuilder.getQuery();
		fqlQueryBuilder.setQuery(null);
	}

	private String query;
	private String accessToken;

	public String getQuery() {
		return query;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public Object execute() throws UnsupportedEncodingException {
		String url = FacebookSupport.FACEBOOK_GRAPH_BASE_URL + "fql?q="
				+ URLEncoder.encode(query, FacebookSupport.CODE_PAGE_STRING)
				+ "&access_token=" + accessToken;
		return JSONCustomUtilities.getJSONStringFromURL(url);
	}
}
