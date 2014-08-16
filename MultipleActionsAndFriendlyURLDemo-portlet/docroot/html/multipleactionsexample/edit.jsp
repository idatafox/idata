<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ page import="javax.portlet.PortletPreferences" %>


<portlet:defineObjects />
<%
   PortletPreferences prefs=renderRequest.getPreferences();
   String  greeting=(String)prefs.getValue("greeting","hello ,elearn007.com.");

%>
<portlet:actionURL var="editGreetingURL" name="setGreeting">
    <portlet:param name="mvcPath" value="/html/multipleactionsexample/edit.jsp" />
</portlet:actionURL>

<aui:form action="<%= editGreetingURL %>" method="post">
    <aui:input label="greeting" name="greeting" type="text" value="<%=greeting %>" />  
    <aui:button type="submit" />
</aui:form>


<portlet:actionURL var="editGreetingURL1" name="sendEmail">
    <portlet:param name="mvcPath" value="/html/multipleactionsexample/view.jsp" />
</portlet:actionURL>


<aui:form action="<%= editGreetingURL1 %>" method="post">
    <aui:input label="sendEmail" name="greeting" type="text" value="***@sina.com.cn" />  
    <aui:button type="submit" />
</aui:form>




<portlet:renderURL var="editGreetingURL2">
   <portlet:param name="mvcPath" value="/html/multipleactionsexample/view.jsp" />
</portlet:renderURL>

<p><a href="<%=editGreetingURL2 %>" >Edit greeting</a></p>