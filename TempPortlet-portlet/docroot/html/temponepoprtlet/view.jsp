<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>
<%@ page import="javax.portlet.PortletSession" %>
<portlet:defineObjects />


<%
String greeting = (String)session.getAttribute("LIFERAY_SHARED_INFO");

    out.println("session atrribute LIFERAY_SHARED_INFO :"+greeting);
%>


<%

PortletSession session_page = renderRequest.getPortletSession();
String ptype = (String)session_page.getAttribute("order-product-type",PortletSession.APPLICATION_SCOPE);
out.println("[processAction::]order-product-type is come from SubscribeOfPortletSessionPortlet:"+ptype);
String pprice = (String)session_page.getAttribute("PRODUCT_SHARED_PRICE",PortletSession.APPLICATION_SCOPE);
out.println("<br>");
out.println("[processAction::]order-product-price is come from SubscribeOfPortletSessionPortlet:"+pprice);
%>