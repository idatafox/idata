 <%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ page import="javax.portlet.PortletPreferences" %>

<portlet:defineObjects/>

<%
   String greeting=null;
   PortletPreferences prefs=renderRequest.getPreferences();
   greeting=(String)prefs.getValue("greeting","hello ,welcome to elearn007.com.");
%>

<portlet:actionURL var="editGreetingURL">
 
   <portlet:param name="mvcPath" value="/html/passvaluesimple/edit.jsp"/>
</portlet:actionURL>

<aui:form action="<%= editGreetingURL %>" method="post">
 
    <aui:input label="greeting" name="greeting" type="text" value="<%=greeting %>" />
    <aui:button type="submit" />
</aui:form>



<portlet:renderURL var="viewGreetingURL">
    <portlet:param name="greeting" value="<%=greeting%>"/>
    <portlet:param name="mvcPath" value="/html/passvaluesimple/view.jsp" />
</portlet:renderURL>

<p><a href="<%= viewGreetingURL %>">&larr; Back</a></p>