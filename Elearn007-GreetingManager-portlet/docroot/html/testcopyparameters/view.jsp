<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page import="javax.portlet.PortletPreferences"  %>
<portlet:defineObjects />

<%
  PortletPreferences prefs=renderRequest.getPreferences();
  //String greeting=(String)prefs.getValue("greeting","welcome111 to elearn007.com!~");
  String greeting=renderRequest.getParameter("greeting");
  


%>
<p><%=greeting%></p>


<portlet:renderURL var="editGreetingURL">
   <portlet:param name="mvcPath" value="/html/testcopyparameters/edit.jsp" />
</portlet:renderURL>

<p><a href="<%=editGreetingURL %>" >Edit greeting</a></p>