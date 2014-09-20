package com.elearn007.liferay.teach;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.xml.namespace.QName;

import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class PublisherEvent
 */
public class PublisherEvent extends MVCPortlet {
 
	public void processAction(ActionRequest actionRequest,ActionResponse actionResponse)
			throws PortletException,IOException
			{
				javax.xml.namespace.QName qName = new QName("http://elearn007.com", "sendPriceInfo", "x");
				actionResponse.setEvent(qName, "You have received Event Data sent from PublisherEvent Portlet");
				System.out.println("EventSenderForPassData.processAction start...");
			}
}
