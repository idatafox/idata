<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>Multiple Actions Example</b> portlet in View mode.


<portlet:renderURL var="editGreetingURL">
   <portlet:param name="mvcPath" value="/html/multipleactionsexample/edit.jsp" />
</portlet:renderURL>

<p><a href="<%=editGreetingURL %>" >Edit greeting</a></p>
