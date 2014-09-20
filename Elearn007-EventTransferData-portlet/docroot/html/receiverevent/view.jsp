<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<%
    String aa=renderRequest.getParameter("price");
     out.println("price== "+aa);
%>


<portlet:renderURL var="editGreetingURL">
   <portlet:param name="mvcPath" value="/html/receiverevent/edit.jsp" />
</portlet:renderURL>

<p><a href="<%=editGreetingURL %>" >Edit greeting</a></p> 