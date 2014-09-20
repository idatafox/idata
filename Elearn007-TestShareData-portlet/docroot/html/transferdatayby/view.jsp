<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>
<%@ page import="javax.portlet.PortletSession" %>
<portlet:defineObjects />

<%
PortletSession session_page = renderRequest.getPortletSession();
String ptype = (String)session_page.getAttribute("order-product-type",PortletSession.APPLICATION_SCOPE);

out.println("[processAction::]order-product-type is come from TransferDatayByPortlet:"+ptype);
out.println("<br>");
%>


<portlet:renderURL var="editGreetingURL">
   <portlet:param name="mvcPath" value="/html/transferdatayby/edit.jsp" />
</portlet:renderURL>

<p><a href="<%=editGreetingURL %>" >Edit greeting</a></p>