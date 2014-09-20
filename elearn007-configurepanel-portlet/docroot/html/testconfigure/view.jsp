<%@include file="/html/initconfigurecontroller/init.jsp" %>

<%@ page import="com.liferay.portal.util.PortalUtil" %>
<%@ page import="javax.portlet.PortletSession" %>


<%
    String redirect = PortalUtil.getCurrentURL(renderRequest);
%>


<aui:button-row>
    <portlet:renderURL var="addLocationURL">
        <portlet:param name="mvcPath" value="/html/initconfigurecontroller/edit.jsp" />
        <portlet:param name="redirect" value="<%= redirect %>" />
    </portlet:renderURL>

    <aui:button onClick="<%= addLocationURL.toString() %>" value="add-location" />
</aui:button-row>


<%
boolean showLocationAddress_view = GetterUtil.getBoolean(portletPreferences.getValue("showLocationAddress", StringPool.TRUE));
out.println("showLocationAddress_view="+showLocationAddress_view);
%>



 <%
       if(showLocationAddress_view==true)
       {
    	   out.println("<p>Name:David Tel:101-000-1111111 address:china</p>");
       }
       else
       {
    	   out.println("<p>Name:David  meeting:mon</p>");
       }
    %>
    
    
 
 
 <%
 String greeting = (String)session.getAttribute("LIFERAY_SHARED_INFO");
 out.println("<font color=red size=3 >appscope session:"+greeting+"</font><br/>");
 %>
 
 
 <% 
PortletSession session_page = renderRequest.getPortletSession();
String ptype = (String)session_page.getAttribute("order-product-type",PortletSession.APPLICATION_SCOPE);
out.println("<font color=red size=3 >[processAction::]order-product-type is come from SubscribeOfPortletSessionPortlet:"+ptype+"</font><br/>");
%>
    
    
    