package com.elearn007.user.common;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import com.liferay.util.bridges.mvc.MVCPortlet;
import java.io.*;
import javax.portlet.PortletException;
/**
 * Portlet implementation class ModiUserProfilePortlet
 */
public class ModiUserProfilePortlet extends MVCPortlet {
 
	 public void processAction(ActionRequest actionRequest,ActionResponse actionResponse)
	    {
	    	try
	    	{
	    		PortletPreferences prefs=actionRequest.getPreferences();
	    		String greeting=actionRequest.getParameter("greeting");
	    		if(greeting!=null)
	    		{
	    			prefs.setValue("greeting", greeting);
	    			prefs.store();
	    		}
	    		
	    		//read parameters from render phase.
	    		actionResponse.setRenderParameter("company-name", "elearn007");
	    		
	    		super.processAction(actionRequest, actionResponse);
	    		
	    	}
	    	catch(Exception e)
	    	{
	    		 System.out.println("UserProfileManager error:"+e.getMessage());
	    	}
	    }
	 
	 
	    //实现help模式
	    public void doHelp(RenderRequest renderRequest,RenderResponse renderResponse)
	    		throws PortletException, IOException
	    { 
	    	PrintWriter writer = renderResponse.getWriter();
	        writer.write("Do Help");
	    }
}
