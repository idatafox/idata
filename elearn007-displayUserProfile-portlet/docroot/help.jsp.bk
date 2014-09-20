
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page import="javax.portlet.PortletPreferences"%>

<portlet:defineObjects />
<%
  PortletPreferences prefs=renderRequest.getPreferences();
  String greeting=(String)prefs.getValue("greeting","hello,welcome to elearn007.com");

%>

<p><%=greeting%></p>


<portlet:renderURL var="editGreetingURL">
     <portlet:param name="mvcPath" value="/edit.jsp"/>
</portlet:renderURL>


<p><a href="<%=editGreetingURL%>">Edit greeting</a></p>


