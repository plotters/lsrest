package com.legalsounds.component;

import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOContext;
import er.directtoweb.components.ERDCustomComponent;

public class FacebookAppRequest extends ERDCustomComponent {
	private static final long serialVersionUID = -5883861304478085475L;

	private static final String facebookApplicationId = "244555502272809";

	public FacebookAppRequest(WOContext context) {
		super(context);
	}

	public String getFacebookApplicationId() {
		return facebookApplicationId;
	}

	public WOActionResults sendFacebookAppRequests() {
		String personsArrayString = (String) context().request()
				.formValueForKey("personsArray");
		StringTokenizer stringTokenizer = new StringTokenizer(
				personsArrayString, ",");
		List<String> personFacebookIDList = new LinkedList<String>();
		while (stringTokenizer.hasMoreTokens()) {
			personFacebookIDList.add(stringTokenizer.nextToken());
		}

		return null;
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