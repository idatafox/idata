package com.elearn007.liferay.test.transferdata;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;


/**
 * Portlet implementation class TestSessionTransferData
 */
public class TestSessionTransferData extends MVCPortlet {
 
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
