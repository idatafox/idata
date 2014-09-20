<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects/>
<%
    String aa=renderRequest.getParameter("price");
     out.println("price== "+aa);
%>


