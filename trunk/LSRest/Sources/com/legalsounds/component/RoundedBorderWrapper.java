package com.legalsounds.component;

import com.webobjects.appserver.WOContext;
import com.webobjects.directtoweb.D2WContext;

import er.directtoweb.components.ERDCustomComponent;

public class RoundedBorderWrapper extends ERDCustomComponent {
	private static final long serialVersionUID = -4108160229877776297L;

	public RoundedBorderWrapper(WOContext context) {
		super(context);
	}

	@Override
	public D2WContext d2wContextFromBindings() {
		return d2wContext();
	}

	@Override
	public D2WContext d2wContext() {
		return (D2WContext) parent().valueForKey("d2wContext");
	}

	@Override
	public boolean synchronizesVariablesWithBindings() {
		return false;
	}
}