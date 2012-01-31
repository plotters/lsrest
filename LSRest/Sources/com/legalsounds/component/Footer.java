package com.legalsounds.component;

import com.webobjects.appserver.WOContext;
import er.directtoweb.components.ERDCustomComponent;

public class Footer extends ERDCustomComponent {
	private static final long serialVersionUID = 7850574974398269787L;

	public Footer(WOContext context) {
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