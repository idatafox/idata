<%@include file="/html/initconfigurecontroller/init.jsp" %>




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