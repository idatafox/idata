package com.elearn007.liferay.teach.session;

import java.io.IOException;

import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.liferay.portal.util.PortalUtil;
/**
 * Portlet implementation class STestSessionDataTransfer
 */
public class STestSessionDataTransfer extends MVCPortlet {
 
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
