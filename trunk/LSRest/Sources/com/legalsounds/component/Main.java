package com.legalsounds.component;

import org.apache.log4j.Logger;

import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WORedirect;
import com.webobjects.appserver.WORequest;
import com.webobjects.appserver.WOResponse;
import com.webobjects.foundation.NSMutableDictionary;

import er.directtoweb.components.ERDCustomComponent;
import er.extensions.appserver.ERXApplication;
import er.extensions.appserver.ERXRequest;

public class Main extends ERDCustomComponent {
	private static final long serialVersionUID = 2026426032732370364L;
	private static Logger log = Logger.getLogger(Main.class);

	public Main(WOContext context) {
		super(context);
	}

	@Override
	public void appendToResponse(WOResponse response, WOContext context) {
		super.appendToResponse(response, context);
		boolean isRequestSecure = ERXRequest.isRequestSecure(context
				.request());

		log.info("ERXRequest.isRequestSecure: " + isRequestSecure);

		log.info("ERXRequest.isRequestSecure: "
				+ ERXApplication.application().directConnectURL());
		
		
//
//		WORedirect loginPageRedirect = (WORedirect) pageWithName("WORedirect");
//		loginPageRedirect.setUrl("https://"
//				+ WORequestAdditions.hostName(context.request())
//				+ context.componentActionURL()
//		);
//		loginPageRedirect.appendToResponse(response, context);
	}

	@Override
	public boolean isStateless() {
		return true;
	}
	
	@Override
	public boolean synchronizesVariablesWithBindings() {
		return false;
	}

}
