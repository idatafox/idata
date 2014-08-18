package com.elearn007.portlet.teach;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;

import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
public class ConfigureActionController extends DefaultConfigurationAction{
	
	public void processAction( PortletConfig portletConfig, 
			ActionRequest actionRequest,
			ActionResponse actionResponse) 
			throws Exception {

	        super.processAction(portletConfig, actionRequest, actionResponse);

	        PortletPreferences prefs = actionRequest.getPreferences();

	        String showLocationAddress = prefs.getValue(
	            "showLocationAddress", "true");

	        System.out.println("showLocationAddress=" + showLocationAddress +
	            " in ConfigurationActionController.processAction().");
	    }

}
