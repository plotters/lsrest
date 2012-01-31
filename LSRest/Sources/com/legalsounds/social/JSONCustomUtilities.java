/**
 * 
 */
package com.legalsounds.social;

import java.io.InputStream;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;

import org.apache.log4j.Logger;

import er.extensions.foundation.ERXStringUtilities;

public class JSONCustomUtilities {
	private static final Logger log = Logger.getLogger(FacebookPerson.class);

	public static String getJSONStringFromURL(String url) {
		String jsonString = null;
		try {
			jsonString = getSecureURLString(url,
					FacebookSupport.CODE_PAGE_STRING);
		} catch (SSLException e) {
			log.error(e, e);
			return null;
		}
		return jsonString;
	}

	
	public static String getSecureURLString(String urlString, String encoding) throws javax.net.ssl.SSLException{
		try {
			URL url = new URL(urlString);
			HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
			connection.setDoOutput(true);
			InputStream is = connection.getInputStream();
			try {
				return encoding!=null ? ERXStringUtilities.stringFromInputStream(is, encoding) : ERXStringUtilities.stringFromInputStream(is);
			} finally {
				is.close();
			}
		} catch (javax.net.ssl.SSLException ssle) {
			log.warn(ssle.getMessage(), ssle);
			throw ssle;
		} catch (Throwable e) {
			log.warn(e.getMessage(), e);
			return "";
		}
	}
}
