package com.elearn007.liferay.teach.sharedata;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.util.bridges.mvc.MVCPortlet;
import javax.portlet.PortletRequestDispatcher;
import  javax.portlet.PortletConfig;
/**
 * Portlet implementation class PublisherWithPublicRenderParameterPortlet
 */
public class PublisherWithPublicRenderParameterPortlet extends MVCPortlet {
	public void processAction(ActionRequest actionRequest,ActionResponse actionResponse)
	throws PortletException,IOException
	{
		   String valueV=actionRequest.getParameter("greeting");
		   actionResponse.setRenderParameter("title",valueV);
		   System.out.println("Publisher processAction call...");
    }
	
	
	 public void render(RenderRequest renderRequest,RenderResponse renderResponse) 
	 throws PortletException, IOException {
          
		  PortletConfig portletConfig = (PortletConfig)renderRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
	     //  PortletRequestDispatcher portletRequestDispatcher = portletConfig.getPortletContext().getRequestDispatcher("/html/publisherwithpublicrenderparameter/view.jsp");
	      // portletRequestDispatcher.include(renderRequest, renderResponse);
		   super.render(renderRequest, renderResponse);
	       System.out.println("Publisher render call...");

	    }

      
	 public void doView(RenderRequest renderRequest,RenderResponse renderResponse) 
			 throws PortletException, IOException {
		 
		   super.doView(renderRequest, renderResponse);
	       System.out.println("Publisher doView call...");
		     
		 
	 }
}
