package com.elearn007.user.common;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletPreferences;
import com.liferay.portal.util.PortalUtil;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import com.liferay.util.bridges.mvc.MVCPortlet;
import javax.portlet.GenericPortlet;
import com.liferay.portal.kernel.servlet.SessionMessages;

/**
 * Portlet implementation class ModiUserParameterCopyPortlet
 */
public class ModiUserParameterCopyPortlet extends MVCPortlet {
	protected String editJSP;
	protected String viewJSP;
	
	public static final String MSG_KEY_USER_UPDATED_SUCCESSFULLY = "user.updated.successfully";
	
	
	//define init method
	/*
	public void init() {
		    viewJSP = getInitParameter("view-template");
		    System.out.println("viewJsp="+viewJSP);
	    }*/
	
	 public void processAction(ActionRequest actionRequest,ActionResponse actionResponse)
	    {
					try
					{
						PortletPreferences prefs=actionRequest.getPreferences();
						String greeting=actionRequest.getParameter("greeting");
						String employeeName=actionRequest.getParameter("employeeName");
						System.out.println("employeeName="+employeeName);
						if(greeting!=null)
						{
							prefs.setValue("greeting", greeting);
							prefs.store();
						}
						
						//read parameters from render phase.
						// actionResponse.setRenderParameter("employeeName", "tomcat");
						//PortalUtil.copyRequestParameters(actionRequest, actionResponse);
						//SessionMessages.add(actionRequest, "success");
						
						super.processAction(actionRequest, actionResponse);
						System.out.println("finished.");
						
					}
					catch(Exception e)
					{
						 System.out.println("UserProfileManager error:"+e.getMessage());
					}
	    }
	 
	 
	  //define business function
	 public void addEmployee(ActionRequest actionRequest,ActionResponse actionResponse)  {
		 try
		 {
			// actionResponse.setRenderParameter("employeeName", "tomcat");
			 //PortalUtil.copyRequestParameters(actionRequest, actionResponse);
			 //actionResponse.setRenderParameter("employeeName", "tomcat");
			 String messageKey = MSG_KEY_USER_UPDATED_SUCCESSFULLY;
			 SessionMessages.add(actionRequest,"your-nose-knows-best","jakelee");
			 System.out.println("execute doEmployee...");
		 }
		 catch(Exception e)
		 {
			 System.out.println("addEmployee error"+e.getMessage());
		 }
			       
	 }
			 
	   //implement doView Method
	 
	 public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
	 {
		 try
		 {
			   System.out.println("execute doView Method...");
		       include("/html/modiuserparametercopy/view.jsp", renderRequest, renderResponse);
		       
		 }
		 catch(Exception e)
		 {
			 System.out.println("doView error="+e.getMessage());
		 }
	 }
  
}
