<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<script>
function setCookieValue(docURL) {
    alert("start...");
    jQuery.cookie("cookieParam",docURL);
      jQuery('#aa').html("hello world");
    alert("setup cookie success.");
}
</script>


<input type="button" value="setCookie" 
onclick="setCookieValue('www.elearn007.com')"/>


<portlet:renderURL var="editGreetingURL">
   <portlet:param name="mvcPath" value="/html/testcookietransferdatabyjquerypub/edit.jsp" />
</portlet:renderURL>

<p><a href="<%=editGreetingURL %>" >Edit greeting</a></p>
