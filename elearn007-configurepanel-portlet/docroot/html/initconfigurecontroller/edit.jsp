<%@include file="/html/initconfigurecontroller/init.jsp" %>

hello,I am working for adding your address information.
   <portlet:renderURL var="addLocationURL">
        <portlet:param name="mvcPath" value="/html/initconfigurecontroller/view.jsp" />    
    </portlet:renderURL>
    
    <p><a href="<%=addLocationURL%>">&larr; Back</a></p>
    
   