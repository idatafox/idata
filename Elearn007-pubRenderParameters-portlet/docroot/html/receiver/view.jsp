<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>Receiver</b> portlet in View mode.


<%
   String priceV=renderRequest.getParameter("price");

   out.println("price="+priceV);

%>

