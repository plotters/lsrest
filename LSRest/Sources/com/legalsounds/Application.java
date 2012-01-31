package com.legalsounds;

import com.legalsounds.controller.ChartController;
import com.legalsounds.model.Chart;

import er.extensions.appserver.ERXApplication;
import er.rest.routes.ERXRouteRequestHandler;

public class Application extends ERXApplication {
	public static void main(String[] argv) {
		ERXApplication.main(argv, Application.class);
	}

	public Application() {
		setDefaultRequestHandler(requestHandlerForKey(directActionRequestHandlerKey()));
		
	    ERXRouteRequestHandler requestHandler;
	    {
	    	requestHandler = new ERXRouteRequestHandler(ERXRouteRequestHandler.WO);
	    	requestHandler.addDefaultRoutes(Chart.ENTITY_NAME, Chart.ENTITY_NAME, true, ChartController.class);
	        
//	        requestHandler.insertRoute(new ERXRoute("Main","", ERXRoute.Method.Get));
//	    	requestHandler.insertRoute(new ERXRoute(Chart.ENTITY_NAME, "/chart", ERXRoute.Method.Get));
	    }
	    ERXRouteRequestHandler.register(requestHandler);
		
		
		setAllowsConcurrentRequestHandling(true);		
	}
	
	@Override
	public boolean _isForeignSupportedDevelopmentPlatform() {
		// TODO Auto-generated method stub
		return super._isForeignSupportedDevelopmentPlatform() || _isAdditionalForeignSupportedDevelopmentPlatform();
	}

	
	/*
	 *  Check for Windows 7
	 *  @return true if runs on Windows 7
	 */
	private boolean _isAdditionalForeignSupportedDevelopmentPlatform() {
		String s = System.getProperty("os.name");
		return ( s != null && s.equals("Windows 7"));
	}
}
