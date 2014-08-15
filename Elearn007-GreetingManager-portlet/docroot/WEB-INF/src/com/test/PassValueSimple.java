package com.test;

import java.io.*;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.*;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class PassValueSimple
 */
public class PassValueSimple extends MVCPortlet {
    String greeting=null;
	public void processAction(ActionRequest actionRequest,ActionResponse actionResponse)
	throws PortletException,IOException
    {
	    //get greeting value from actionRequest
		/*
		 PortletPreferences prefs=actionRequest.getPreferences();
	     greeting=(String)actionRequest.getParameter("greeting");
		 System.out.println("greeting="+greeting);*/
		// PortalUtil.copyRequestParameters(actionRequest, actionResponse);
		//put greeting value into prefs
		/*
		if(greeting!=null)
 		{
 			prefs.setValue("greeting", greeting);
 			prefs.store();
 		}
		System.out.println("processAction finished.");*/
		
		 //send String greeting to render side.
		//  actionResponse.setRenderParameter("greeting", greeting);
		  super.processAction(actionRequest, actionResponse);
		  PortalUtil.copyRequestParameters(actionRequest, actionResponse);
		  System.out.println("finished");
		 
     }
	
	//define updateGreeting
	 public void updateGreeting(ActionRequest actionRequest,ActionResponse actionResponse) 
	 throws PortletException,IOException{
		    
			 PortletPreferences prefs=actionRequest.getPreferences();
		     greeting=(String)actionRequest.getParameter("greeting");
			
			
			//put greeting value into prefs
		     /*
			if(greeting!=null)
	 		{
	 			prefs.setValue("greeting", greeting);
	 			prefs.store();
	 		}
			System.out.println("updateGreeting finished.");*/
			// super.processAction(actionRequest, actionResponse);
			//actionResponse.sendRedirect("/html/passvaluesimple/view.jsp");
			
			// actionResponse.setPortletMode(PortletMode.VIEW);
			//sendRedirect(actionRequest,actionResponse);
			
			
		    
	 }
	
	//define doView()
	
	 public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
	 throws PortletException,IOException
	 {
		
			   System.out.println("execute doView Method...");
		       // include("/html/passvaluesimple/view.jsp", renderRequest, renderResponse);
		       super.doView(renderRequest, renderResponse);
		       
		
	 }
	
}
