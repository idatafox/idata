package com.elearn007.liferay.teach.sharedata;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.portal.util.PortalUtil;
import javax.servlet.http.*; 
/**
 * Portlet implementation class SubScriberOfSessionPortlet
 */
public class SubScriberOfSessionPortlet extends MVCPortlet {
 
	
	public void processAction(ActionRequest actionRequest,ActionResponse actionResponse)
	throws PortletException,IOException
	 {
		 HttpServletRequest httpreq = PortalUtil.getHttpServletRequest(actionRequest);
		 HttpSession session = httpreq.getSession(true);
		 String userName=actionRequest.getParameter("greeting");
		 session.setAttribute("LIFERAY_SHARED_INFO", userName);
		 System.out.println("start processAction...");
	 }

}
