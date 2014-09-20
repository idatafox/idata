<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>Test Session Transfer Data</b> portlet in View mode.
<portlet:renderURL var="editGreetingURL">
   <portlet:param name="mvcPath" value="/html/testsessiontransferdata/edit.jsp" />
</portlet:renderURL>

<p><a href="<%=editGreetingURL %>" >Edit greeting</a></p>