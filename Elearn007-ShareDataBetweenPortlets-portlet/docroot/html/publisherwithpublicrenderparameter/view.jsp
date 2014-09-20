<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />
<portlet:renderURL var="editGreetingURL">
   <portlet:param name="mvcPath" value="/html/publisherwithpublicrenderparameter/edit.jsp" />
</portlet:renderURL>

<p><a href="<%=editGreetingURL %>" >Edit greeting</a></p>