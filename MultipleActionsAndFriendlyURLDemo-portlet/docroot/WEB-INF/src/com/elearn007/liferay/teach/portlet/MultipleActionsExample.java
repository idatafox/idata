package com.elearn007.liferay.teach.portlet;

import com.liferay.util.bridges.mvc.MVCPortlet;
import javax.portlet.PortletException;
import java.io.IOException;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;


/**
 * Portlet implementation class MultipleActionsExample
 */
public class MultipleActionsExample extends MVCPortlet {
 
	//set greeting text message.
   public void setGreeting(ActionRequest actionRequest,ActionResponse actionResponse)
   throws PortletException,IOException
   {
	    System.out.println("getGreeting started!~");    
   }
   //send email
   public void sendEmail(ActionRequest actionRequest,ActionResponse actionResponse)
   throws PortletException,IOException
   {
	         System.out.println("sendEmail started!~");       
	}
   
}
