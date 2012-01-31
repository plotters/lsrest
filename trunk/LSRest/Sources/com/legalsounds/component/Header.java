package com.legalsounds.component;

import com.webobjects.appserver.WOContext;
import er.directtoweb.components.ERDCustomComponent;

public class Header extends ERDCustomComponent {
	private static final long serialVersionUID = -7627397431597601027L;

	public Header(WOContext context) {
        super(context);
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