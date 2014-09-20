<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

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
			            if (cookies[i].getName().equals("productName")) {
			                sessionid = cookies[i].getValue();
			                
			                break;
			            }
			        }
			    }
			   out.println("productName:"+sessionid);
    
  %>