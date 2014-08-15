<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ page import="javax.portlet.PortletPreferences,com.liferay.portal.kernel.servlet.SessionMessages"  %>
<portlet:defineObjects />

<liferay-ui:success key="success" message="Greeting saved successfully!"/>

<liferay-ui:error key="error" message="Sorry, an error prevented saving your greeting" />

<%
   PortletPreferences prefs=renderRequest.getPreferences();
  //String greeting=(String)prefs.getValue("greeting","welcome111 to elearn007.com!~");
   String greeting=renderRequest.getParameter("greeting");
   prefs.setValue("ifValidOrder", "true");
   prefs.store();


%>
<p><%=greeting%></p>


<portlet:renderURL var="editGreetingURL">
   <portlet:param name="mvcPath" value="/html/pushvaluethroughsession/edit.jsp" />
</portlet:renderURL>

<p><a href="<%=editGreetingURL %>" >Edit greeting</a></p>