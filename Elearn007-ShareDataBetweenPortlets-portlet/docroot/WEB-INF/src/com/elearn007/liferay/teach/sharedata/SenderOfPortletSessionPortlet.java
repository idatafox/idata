package com.elearn007.liferay.teach.sharedata;

import java.io.IOException;

import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.portal.util.PortalUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.servlet.http.*;
import javax.portlet .PortletSession;
import javax.servlet.http.*; 
/**
 * Portlet implementation class SenderOfPortletSessionPortlet
 */
public class SenderOfPortletSessionPortlet extends MVCPortlet {
 
	public void processAction(ActionRequest actionRequest,ActionResponse actionResponse)
	throws PortletException,IOException
	 {
		PortletSession session = actionRequest.getPortletSession();
		String productType=actionRequest.getParameter("greeting");
		
	     session.setAttribute("PRODUCT_SHARED_PRICE","$10000.00" ,PortletSession.APPLICATION_SCOPE);
		 session.setAttribute("order-product-type",productType ,PortletSession.APPLICATION_SCOPE);
	      session.setAttribute("order-product-name",productType ,PortletSession.PORTLET_SCOPE);
	    System.out.println("set up atrribute order-product-type equals "+productType+" Car with processAction method");
		
	 }
}
