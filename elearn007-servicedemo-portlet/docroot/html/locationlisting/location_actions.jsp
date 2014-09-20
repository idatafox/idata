<%@ include file="/html/locationlisting/init.jsp" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.liferay.portal.util.PortalUtil" %>
<%@ page import="com.elearn007.services.teach.model.Location"%>
<%@ page import="com.elearn007.services.teach.service.LocationLocalServiceUtil"%>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<%
    ResultRow row = (ResultRow) request
            .getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Location location = (Location) row.getObject();

    long groupId = location.getGroupId();
    String name = Location.class.getName();
    long locationId = location.getLocationId();

    String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<liferay-ui:icon-menu>
    <portlet:renderURL var="editURL">
        <portlet:param name="mvcPath" value="/html/locationlisting/edit_location.jsp" />
        <portlet:param name="locationId" value="<%= String.valueOf(locationId) %>" />
        <portlet:param name="redirect" value="<%= redirect %>" />
    </portlet:renderURL>

    <liferay-ui:icon image="edit" url="<%= editURL.toString() %>" />

    <portlet:actionURL name="deleteLocation" var="deleteURL">
        <portlet:param name="locationId" value="<%= String.valueOf(locationId) %>" />
        <portlet:param name="redirect" value="<%= redirect %>" />
    </portlet:actionURL>

    <liferay-ui:icon-delete url="<%= deleteURL.toString() %>" />
</liferay-ui:icon-menu>