package com.test;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class TestCopyParameters
 */
public class TestCopyParameters extends MVCPortlet {
	public void processAction(ActionRequest actionRequest,ActionResponse actionResponse)
	throws PortletException,IOException
		    {
		      
		    	 
		            super.processAction(actionRequest, actionResponse);
		            PortalUtil.copyRequestParameters(actionRequest, actionResponse);
		            actionResponse.setRenderParameter("mvcPath", "/html/testcopyparameters/view.jsp"); 
		       }
		     
		       
		        	
		   

}
