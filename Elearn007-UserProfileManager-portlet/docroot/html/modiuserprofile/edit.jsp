<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ page import="javax.portlet.PortletPreferences" %>

<portlet:defineObjects/>
<%!
  String companyName="wu";
%>
<%
   PortletPreferences prefs=renderRequest.getPreferences();
   String greeting=renderRequest.getParameter("greeting");
   if(greeting!=null){
	   prefs.setValue("greeting",greeting);
	   prefs.store();
	   
  companyName=renderRequest.getParameter("company-name");
   
%>
<p>Greeting saved successfully!</p>
<%
}
%>

<%
   greeting=(String)prefs.getValue("greeting","hello ,welcome to elearn007.com.");
%>

<portlet:actionURL var="editGreetingURL">
 
   <portlet:param name="mvcPath" value="/html/modiuserprofile/edit.jsp"/>
</portlet:actionURL>



<aui:form action="<%= editGreetingURL %>" method="post">
    <aui:input label="greeting" name="greeting" type="text" value="<%=greeting %>" />
    <aui:button type="submit" />
</aui:form>

<portlet:renderURL var="viewGreetingURL">
    <portlet:param name="mvcPath" value="/html/modiuserprofile/view.jsp" />
</portlet:renderURL>

<p><a href="<%= viewGreetingURL %>">&larr; Back</a></p>


<p>compnay Name:<%=companyName%></p>



