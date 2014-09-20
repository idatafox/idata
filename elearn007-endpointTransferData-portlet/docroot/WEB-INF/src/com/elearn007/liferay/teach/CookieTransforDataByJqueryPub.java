package com.elearn007.liferay.teach;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class CookieTransforDataByJqueryPub
 */
public class CookieTransforDataByJqueryPub extends MVCPortlet {
 
	public void processAction(ActionRequest actionRequest,ActionResponse actionResponse)
			throws PortletException,IOException
		    {
				HttpServletResponse response= PortalUtil.getHttpServletResponse(actionResponse);
				Cookie cookieParam = new Cookie("sitename", "elearn007.com");
				response.addCookie(cookieParam);
			 }
}
