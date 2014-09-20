<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>
<%@ page import="javax.portlet.PortletSession" %>
<portlet:defineObjects />

This is the <b>Sub Scriber Of Portlet Session</b> portlet in View mode.
<%
PortletSession session_page = renderRequest.getPortletSession();
String pname = (String)session_page.getAttribute("order-product-name",PortletSession.APPLICATION_SCOPE);
String ptype = (String)session_page.getAttribute("order-product-type",PortletSession.PORTLET_SCOPE);

//session_page.setAttribute("PRODUCT_SHARED_PRICE","$20000.00" ,PortletSession.APPLICATION_SCOPE);

String pprice = (String)session_page.getAttribute("PRODUCT_SHARED_PRICE",PortletSession.APPLICATION_SCOPE);


out.println("[processAction::]order-product-type is come from SubscribeOfPortletSessionPortlet:"+ptype);
out.println("<br>");
out.println("[processAction::]order-product-name is come from SubscribeOfPortletSessionPortlet:"+pname);

out.println("<br>");
out.println("[processAction::]order-product-price is come from SubscribeOfPortletSessionPortlet:"+pprice);

%>



