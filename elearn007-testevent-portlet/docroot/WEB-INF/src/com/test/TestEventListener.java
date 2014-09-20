package com.test;

import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class TestEventListener
 */
public class TestEventListener extends MVCPortlet {
 
	 @javax.portlet.ProcessEvent(qname = "{http://elearn007.com}sendPriceInfo")
		public void handleProcesssendPriceInfoEvent(javax.portlet.EventRequest request, javax.portlet.EventResponse response)
		throws javax.portlet.PortletException, java.io.IOException
		{
			javax.portlet.Event event = request.getEvent();
	        String eventValue = (String) event.getValue();
	        System.out.print("eventValue in process first ::" + eventValue);
	        response.setRenderParameter("price", eventValue);
			
		}
		
}
