<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>
<portlet:defineObjects />

<%
   String titleV=renderRequest.getParameter("title");

   out.println("titleV="+titleV);

%>

