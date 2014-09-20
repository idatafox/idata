package com.elearn007.liferay.teach.sharedata;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletSession;

import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class SubScriberOfPortletSessionPortlet
 */
public class SubScriberOfPortletSessionPortlet extends MVCPortlet {
	
	public void processAction(ActionRequest actionRequest,ActionResponse actionResponse)
			throws PortletException,IOException
			 {
			
			     PortletSession session = actionRequest.getPortletSession();
			     String ptype = (String)session.getAttribute("order-product-type",PortletSession.APPLICATION_SCOPE);
                 System.out.println("[processAction::]order-product-type is come from SubscribeOfPortletSessionPortlet:"+ptype);
                 
				
			 }
 
	 

}
