package com.legalsounds.controller;

import com.legalsounds.model.Chart;
import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WORequest;

import er.extensions.eof.ERXKeyFilter;
import er.rest.ERXRestFetchSpecification;
import er.rest.routes.ERXRouteController;
import er.rest.routes.jsr311.GET;

public class ChartController extends ERXRouteController {

	public ChartController(WORequest request) {
		super(request);
	}

	@GET
	public WOActionResults chartAction() {
		ERXRestFetchSpecification<Chart> fetchSpec = new ERXRestFetchSpecification<Chart>(
				Chart.ENTITY_NAME, null, null,
				ERXKeyFilter.filterWithAllRecursive(), null, 25
		);
		return response(fetchSpec, ERXKeyFilter.filterWithAttributes());
	}
}
