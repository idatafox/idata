<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />


<%
String greeting = (String)session.getAttribute("LIFERAY_SHARED_INFO");
out.println("TEST:welcome greeting info from other one:"+greeting);
%>