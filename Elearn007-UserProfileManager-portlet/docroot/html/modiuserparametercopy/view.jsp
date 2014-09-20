<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ page import="javax.portlet.PortletPreferences"  %>

<portlet:defineObjects />

<%
  PortletPreferences prefs=renderRequest.getPreferences();
  String greeting=(String)prefs.getValue("greeting","welcome to elearn007.com!~");
  
  String companyName=renderRequest.getParameter("greeting");
  String employeeNameV=renderRequest.getParameter("employeeName");
 
 
%>
<p><%=greeting%></p>
<p>hi:<%=employeeNameV%> 



<liferay-ui:success key="user.updated.successfully" message="user.updated.successfully"/>

<liferay-ui:message key="your-nose-knows-best" arguments='<%=new String[]{"000","1111"}%>'/>

<portlet:renderURL var="editGreetingURL">
   <portlet:param name="mvcPath" value="/html/modiuserparametercopy/edit.jsp" />
</portlet:renderURL>

<p><a href="<%=editGreetingURL %>" >Edit greeting</a></p>

<p>compnay Name********====:<%=companyName%></p>