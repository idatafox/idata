<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ page import="javax.portlet.PortletPreferences"  %>
<portlet:defineObjects />


<%
    //String aa=renderRequest.getParameter("price");
   //  out.println("price "+aa);
%>

<portlet:actionURL var="editGreetingURL" >
   <portlet:param name="mvcPath" value="/html/receiverevent/edit.jsp"/>
</portlet:actionURL>

<aui:form action="<%= editGreetingURL %>" method="post">
    <aui:input label="greeting" name="greeting" type="text" value="hi elearn007.com" />  
    <aui:button type="submit" />
</aui:form>