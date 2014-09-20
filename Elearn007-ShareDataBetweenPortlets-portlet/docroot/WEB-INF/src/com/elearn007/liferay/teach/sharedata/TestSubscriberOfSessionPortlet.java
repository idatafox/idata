package com.elearn007.liferay.teach.sharedata;

import java.io.IOException;

import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.portal.util.PortalUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.servlet.http.*; 
/**
 * Portlet implementation class TestSubscriberOfSessionPortlet
 */
public class TestSubscriberOfSessionPortlet extends MVCPortlet {
 
	public void processAction(ActionRequest actionRequest,ActionResponse actionResponse)
	throws PortletException,IOException
	{
		 System.out.println("testSubscriberSession start...");
		 /*
				 HttpServletRequest httpreq = PortalUtil.getHttpServletRequest(actionRequest);
				 HttpSession session = httpreq.getSession(true);
				 //String userName=actionRequest.getParameter("greeting");
				 session.setAttribute("LIFERAY_SHARED_INFO", "version:6.2");*/
				 super.processAction(actionRequest, actionResponse);
				 actionResponse.setRenderParameter("mvcPath", "/html/testsubscriberofsession/view.jsp"); 
	}
}
