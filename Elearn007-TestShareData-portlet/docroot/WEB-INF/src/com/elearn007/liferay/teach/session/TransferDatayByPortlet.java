package com.elearn007.liferay.teach.session;

import java.io.IOException;

import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet .PortletSession;
/**
 * Portlet implementation class TransferDatayByPortlet
 */
public class TransferDatayByPortlet extends MVCPortlet {
 
	public void processAction(ActionRequest actionRequest,ActionResponse actionResponse)
			throws PortletException,IOException
			 {
				PortletSession session = actionRequest.getPortletSession();
				String productType=actionRequest.getParameter("greeting");
				
			    
				 session.setAttribute("order-product-type",productType ,PortletSession.APPLICATION_SCOPE);
			     
			    System.out.println("set up atrribute order-product-type equals "+productType+" Car with processAction method");
				
			 }
}
