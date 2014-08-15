<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<%
  String greeting=(String)renderRequest.getParameter("greeting");
  out.println("greeting="+greeting);
%>
<portlet:renderURL var="editGreetingURL">
   <portlet:param name="mvcPath" value="/html/passvaluesimple/edit.jsp" />
</portlet:renderURL>

<p><a href="<%=editGreetingURL %>" >Edit greeting</a></p>