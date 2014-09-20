<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page import="javax.portlet.PortletPreferences"  %>

<portlet:defineObjects />

<%
  PortletPreferences prefs=renderRequest.getPreferences();
  String greeting=(String)prefs.getValue("greeting","welcome to elearn007.com!~");
  
  String companyName=renderRequest.getParameter("company-name");

%>
<p><%=greeting%></p>

<portlet:renderURL var="editGreetingURL">
   <portlet:param name="mvcPath" value="/html/modiuserprofile/edit.jsp" />
</portlet:renderURL>

<p><a href="<%=editGreetingURL %>" >Edit greeting</a></p>

<p>compnay Name****:<%=companyName%></p>