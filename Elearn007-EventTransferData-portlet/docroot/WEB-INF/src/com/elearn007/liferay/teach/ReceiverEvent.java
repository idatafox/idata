package com.elearn007.liferay.teach;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.util.bridges.mvc.MVCPortlet;

import javax.portlet.EventPortlet;
/**
 * Portlet implementation class ReceiverEvent
 */
public class ReceiverEvent extends MVCPortlet{
 
	
	public void processAction(ActionRequest actionRequest,ActionResponse actionResponse)
			throws PortletException,IOException
		    {
				
		          System.out.println("ReceiverEvent.processAction started..."); 
		          super.processAction(actionRequest, actionResponse);
		    }
	
	
	public void sendRead(ActionRequest actionRequest,ActionResponse actionResponse)
			throws PortletException,IOException
			{
						System.out.println("ReceiverEvent.doRead started..."); 
			}
	
	 @javax.portlet.ProcessEvent(qname = "{http://elearn007.com}sendPriceInfo")
	public void handleProcesssendPriceInfoEvent(javax.portlet.EventRequest request, javax.portlet.EventResponse response)
	throws javax.portlet.PortletException, java.io.IOException
	{
		javax.portlet.Event event = request.getEvent();
        String eventValue = (String) event.getValue();
        System.out.print("eventValue in process first ::" + eventValue);
        response.setRenderParameter("price", eventValue);
		
	}
	
	
	
	
	public void render(RenderRequest renderRequest,RenderResponse renderResponse)
			throws PortletException,IOException
			{
		       //该方法在portlet被添加到页面，执行doview 之前执行，可以在这里进行数据库读写方面的功能实现。
		       System.out.println("execute render process...");
		      // doView(renderRequest,renderResponse);
		       super.render(renderRequest,  renderResponse);
		       
			}
	
	 public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			 throws PortletException,IOException
			 {
				
					   System.out.println("execute doView Method...");
				      
				       super.doView(renderRequest, renderResponse);
				       
				
			 }
}
