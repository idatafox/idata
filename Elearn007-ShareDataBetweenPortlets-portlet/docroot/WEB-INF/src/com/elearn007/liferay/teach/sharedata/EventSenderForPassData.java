package com.elearn007.liferay.teach.sharedata;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.xml.namespace.QName;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class EventSenderForPassData
 */
public class EventSenderForPassData extends MVCPortlet {
 
	public void processAction(ActionRequest actionRequest,ActionResponse actionResponse)
	throws PortletException,IOException
	{
		javax.xml.namespace.QName qName = new QName("http://elearn007.com", "webCastDescription", "x");
		actionResponse.setEvent(qName, "You have received Event Data sent from EventSenderForPassData Portlet");
		System.out.println("EventSenderForPassData.processAction start...");
	}
}
