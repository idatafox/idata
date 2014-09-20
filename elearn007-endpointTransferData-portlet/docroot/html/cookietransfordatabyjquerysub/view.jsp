<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>
<%@ page import="javax.servlet.http.*" %>
<portlet:defineObjects />
<!--  
<script src="http://code.jquery.com/jquery-1.4.2.min.js"></script>
<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-cookie/1.4.1/jquery.cookie.min.js"></script>
-->

getCookie::

<script>
 function getCookieValue()
 {
   var aa=jQuery.cookie("cookieParam");
   alert("cookie=="+aa);
 }
</script>

<input type="button" value="getCookie" onClick="getCookieValue()"/>

<% 

		     String sessionid = "";
		     Cookie[] cookies = request.getCookies();
		     
			    if (cookies != null) {
			        for (int i = 0; i < cookies.length; i++) {
			        	//out.println("cook["+i+"]="+cookies[i].getName());
			            if (cookies[i].getName().equals("sitename")) {
			                sessionid = cookies[i].getValue();
			                
			                break;
			            }
			        }
			    }
			   out.println("site name:"+sessionid);
    
  %>