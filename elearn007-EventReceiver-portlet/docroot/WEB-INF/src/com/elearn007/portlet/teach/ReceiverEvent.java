package com.elearn007.portlet.teach;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class ReceiverEvent
 */
public class ReceiverEvent extends MVCPortlet {
   /*
	public void processAction(ActionRequest actionRequest,ActionResponse actionResponse)
	throws PortletException,IOException
	{
		System.out.println("ReceiverEvent.processAction started111..."); 
	}
	*/
	public void sendRead(ActionRequest actionRequest,ActionResponse actionResponse)
	throws PortletException,IOException
	{
				System.out.println("ReceiverEvent.doRead started..."); 
	}
	
	public void handleProcessWebCastDescriptionEvent(javax.portlet.EventRequest request, javax.portlet.EventResponse response)
	throws javax.portlet.PortletException, java.io.IOException
	{
		javax.portlet.Event event = request.getEvent();
        String eventValue = (String) event.getValue();
        System.out.print("eventValue in process ::" + eventValue);
        response.setRenderParameter("webCastInfo", eventValue);
		System.out.println("::ReceiverEvent.handleProcessWebCastDescriptionEvent started..."); 
	}
	public void processEvent(javax.portlet.EventRequest request, javax.portlet.EventResponse response)
	throws javax.portlet.PortletException, java.io.IOException
	{
		javax.portlet.Event event = request.getEvent();
        String eventValue = (String) event.getValue();
        System.out.print("eventValue in process :" + eventValue);
        response.setRenderParameter("webCastInfo", eventValue);
		System.out.println("ReceiverEvent.processEvent started..."); 
	}
}
