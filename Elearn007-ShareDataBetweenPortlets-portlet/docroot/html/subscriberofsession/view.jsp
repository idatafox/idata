<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>Sub Scriber Of Session</b> portlet in View mode.
<%
String greeting = (String)session.getAttribute("LIFERAY_SHARED_INFO");
out.println("welcome greeting info :"+greeting);
%>


<portlet:renderURL var="editGreetingURL">
   <portlet:param name="mvcPath" value="/html/subscriberofsession/edit.jsp" />
</portlet:renderURL>

<p><a href="<%=editGreetingURL %>" >Edit greeting</a></p>



