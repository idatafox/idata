<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<%
String greeting = (String)session.getAttribute("LIFERAY_SHARED_INFO");
out.println("welcome greeting info from session:"+greeting);
%>

<portlet:renderURL var="editGreetingURL">
   <portlet:param name="mvcPath" value="/html/transferdatabysession/edit.jsp" />
</portlet:renderURL>

<p><a href="<%=editGreetingURL %>" >Edit greeting</a></p>
