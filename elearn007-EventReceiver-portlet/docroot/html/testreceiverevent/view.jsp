<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page import="javax.portlet.PortletPreferences"  %>
<portlet:defineObjects />

This is the <b>Test Receiver Event</b> portlet in View mode.
<%
PortletPreferences prefs=renderRequest.getPreferences(); 
%>