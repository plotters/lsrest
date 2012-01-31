package com.legalsounds.component;

import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSArray;

import er.directtoweb.components.ERDCustomComponent;

public class NavigationPanel extends ERDCustomComponent {
	private static final long serialVersionUID = -4871716238058020L;
	
	private static final Integer MIN_ALLOWED_YEAR = new Integer("1900");
	private static NSArray<Integer> years = null;
	private static String[] MAIN_DIRECT_ACTIONS = { "charts",
			"mostDownloaded", "hotReleases", "justAdded", "soundtracks" };
	public String directAction;

	public String letter;
	public Integer year;

	public NavigationPanel(WOContext context) {
		super(context);
	}

	public String[] directActions() {
		return MAIN_DIRECT_ACTIONS;
	}

	public String directActionLabel() {
		return String.format("NavigationPanel.%s", directAction);
	}

	public boolean isLastDirectAction() {
		return directAction.equals(directActions()[directActions().length - 1]);
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
