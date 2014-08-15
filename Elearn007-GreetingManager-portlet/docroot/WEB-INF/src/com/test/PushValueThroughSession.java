package com.test;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;

import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.portlet.*;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import  javax.portlet.PortletConfig;

import com.liferay.portal.kernel.util.*; 

/**
 * Portlet implementation class PushValueThroughSession (LiferayPortletConfig portletConfig,
 */
public class PushValueThroughSession extends MVCPortlet {
 
	 String oldValue="";
	public void processAction(ActionRequest actionRequest,ActionResponse actionResponse)
			throws PortletException,IOException
	 {
				      
		String greeting=actionRequest.getParameter("greeting");
		System.out.println("greeting=="+greeting);
		actionResponse.setRenderParameter("greeting",greeting);
		
		PortletPreferences prefs=actionRequest.getPreferences();
		String uu=prefs.getValue("ifValidOrder", "not set up");
		System.out.println("ifValidOrder from Action is"+uu);
		
		/*
		if(uu!=null)
		{
			if(uu.equals("false"))
			    SessionMessages.add(actionRequest, "success");   	 
		}*/
		
		
		/*
		 * [note]
		 * below three lines that's in order to hide liferay's default error message.
		 * if there's no the three lines ,you will see two errors one is yours ,
		 *  the other one is from liferay .
		 */
		
		 PortletConfig portletConfig = (PortletConfig)actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		 LiferayPortletConfig liferayPortletConfig = (LiferayPortletConfig) portletConfig;
		 SessionMessages.add(actionRequest, liferayPortletConfig.getPortletId() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		 
		
		
		if(greeting.equals("elearn007.com"))
		{
		     SessionMessages.add(actionRequest, "success");   
		
		}
		else
		{
			
			 SessionErrors.add(actionRequest, "error");
		}
		
		
		
		 super.processAction(actionRequest, actionResponse);
		 actionResponse.setRenderParameter("mvcPath", "/html/pushvaluethroughsession/view.jsp"); 
		 System.out.println("execute processAction*****");
		
		 
		
				          
	 }
	
	public void render(RenderRequest renderRequest,RenderResponse renderResponse)
			throws PortletException,IOException
			{
		       //该方法在portlet被添加到页面，执行doview 之前执行，可以在这里进行数据库读写方面的功能实现。
		       System.out.println("execute render process...");
		      // doView(renderRequest,renderResponse);
		       super.render(renderRequest,  renderResponse);
		       
			}
	
	public void doView(RenderRequest renderRequest,RenderResponse renderResponse)
			throws PortletException,IOException
	 {
		 System.out.println("execute doView...");
		
		 PortletPreferences prefs=renderRequest.getPreferences();
		 String uu=prefs.getValue("ifValidOrder","not set up still");
		 System.out.println("ifValidOrder from doView=="+uu);
		 
		 super.doView(renderRequest, renderResponse);
	 }
	 
}




