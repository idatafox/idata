<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>
<%@ page import="javax.portlet.PortletSession" %>
<portlet:defineObjects />
<%

PortletSession session_page = renderRequest.getPortletSession();
String ptype = (String)session_page.getAttribute("order-product-type",PortletSession.APPLICATION_SCOPE);
out.println("<br>");
out.println("[processAction::]order-product-price is come from TransferDatayByPortlet:"+ptype);

%>
