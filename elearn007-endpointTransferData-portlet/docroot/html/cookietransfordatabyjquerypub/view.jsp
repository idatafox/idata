<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>
<%@ page import="javax.servlet.http.*" %>
<portlet:defineObjects />
<!--  
<script src="http://code.jquery.com/jquery-1.4.2.min.js"></script>
<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-cookie/1.4.1/jquery.cookie.min.js"></script>
-->
set cookie::
<script>





jQuery('input.delete_button').click(
	       function(event) {
	           alert("here in click event");
	            return false;
	        }
	    );


function setCookieValue(docURL) {
	    alert("start...");
        jQuery.cookie("cookieParam",docURL);
          jQuery('#aa').html("hello world");
        alert("setup cookie success.");
  }
</script>

<div id="aa">
   hello world!!!!!!~
</div>
<input type="button" value="setCookie" onclick="setCookieValue('www.google.com')"/>

<input type="button" id="delete_button" value="delete"/>


<portlet:renderURL var="editGreetingURL">
   <portlet:param name="mvcPath" value="/html/cookietransfordatabyjquerypub/edit.jsp" />
</portlet:renderURL>

<p><a href="<%=editGreetingURL %>" >Edit greeting</a></p>


