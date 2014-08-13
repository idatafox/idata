package com.test;
import java.io.*;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class ModifyWelcomeGreeting
 */
public class ModifyWelcomeGreeting extends MVCPortlet {
 
	public void processAction(ActionRequest actionRequest,ActionResponse actionResponse)
	throws PortletException,IOException
    {
		
    }
	 //实现help模式
    public void doHelp(RenderRequest renderRequest,RenderResponse renderResponse)
    throws PortletException,IOException
    {
    	PrintWriter writer = renderResponse.getWriter();
        writer.write("<font color='red' size='5'>启用了HELP模式</font>");
    }
}
