package com.elearn007.user.common;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class UserProfileManager extends MVCPortlet{
	
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
    		
    		
    		super.processAction(actionRequest, actionResponse);
    		
    	}
    	catch(Exception e)
    	{
    		 System.out.println("UserProfileManager error:"+e.getMessage());
    	}
    }
    
    //实现help模式
    public void doHelp(ActionRequest actionRequest,ActionResponse actionResponse)
    {
    	  System.out.println("正在执行help模式....");
    }
}
