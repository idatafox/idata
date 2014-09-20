<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ page import="javax.portlet.PortletPreferences" %>

<portlet:defineObjects/>

<%

  PortletPreferences prefs=renderRequest.getPreferences();
  String greeting=renderRequest.getParameter("greeting");
  if(greeting!=null){
    prefs.setValue("greeting",greeting);
    prefs.store();
%>
   <p class="greeting-content"> Greeting saved successfully!</p>

<%
}
%>

<%
  greeting=(String)prefs.getValue("greeting","Hello,welcome to elearn007.com");
%>

<portlet:renderURL var="editGreetingURL">

    <portlet:param name="mvcPath" value="/edit.jsp"/>
</portlet:renderURL>

<aui:form action="<%=editGreetingURL%>" method="post">
  <aui:input label="greeting" name="greeting" type="text"
             value="<%=greeting%>"/>
  <aui:button type="submit"/>
</aui:form>

<portlet:renderURL var="viewGreetingURL">
  <portlet:param name="mvcPath" value="/view.jsp"/>
</portlet:renderURL>

<p><a href="<%=viewGreetingURL%>">&larr; Back</a></p>







   
