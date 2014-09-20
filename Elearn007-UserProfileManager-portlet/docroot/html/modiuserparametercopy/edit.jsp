<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ page import="javax.portlet.PortletPreferences" %>

<portlet:defineObjects/>
<%!
  String employeeName="wu";
  String greeting=null;
%>
<%
   PortletPreferences prefs=renderRequest.getPreferences();
   greeting=renderRequest.getParameter("greeting");
   if(greeting!=null){
	   prefs.setValue("greeting",greeting);
	   prefs.store();
	   
    employeeName=renderRequest.getParameter("employeeName");
   
%>
<p>Greeting saved successfully!</p>
<p>employeeName:<%=employeeName%></p>
<%
}
%>

<%
   greeting=(String)prefs.getValue("greeting","hello ,welcome to elearn007.com.");
%>

<portlet:actionURL var="editGreetingURL">

    <portlet:param name="<%=javax.portlet.ActionRequest.ACTION_NAME%>" value="addEmployee"/>
   <portlet:param name="employeeName" value="Meera Prince"/>
    <portlet:param name="employeeID" value="001"/>
</portlet:actionURL>



<aui:form action="<%= editGreetingURL %>" method="post">
    <aui:input label="greeting" name="greeting" type="text" value="<%=greeting %>" />
    <aui:button type="submit" />
</aui:form>



<portlet:renderURL var="viewGreetingURL">
    <portlet:param name="employeeName" value="Meera Prince"/>
    <portlet:param name="mvcPath" value="/html/modiuserparametercopy/view.jsp" />
</portlet:renderURL>

<p><a href="<%= viewGreetingURL %>">&larr; Back</a></p>


<p>compnay Name:<%=greeting%></p>



