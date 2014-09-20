<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ page import="javax.portlet.PortletPreferences" %>
<portlet:defineObjects />


<portlet:actionURL var="editGreetingURL">
   <portlet:param name="mvcPath" value="/html/publishpriceinfo/view.jsp"/>
</portlet:actionURL>

<aui:form action="<%= editGreetingURL %>" method="post">
    <aui:input label="price" name="price" type="text" value="pls set price" />  
    <aui:button type="submit" />
</aui:form>