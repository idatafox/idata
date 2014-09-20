<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %> 
<portlet:defineObjects />

<aui:script>
 function aa()
 {
	 alert("hello,ibc.");
 }
 
 YUI().use(
		    'aui-char-counter',
		    function(Y) {
		      new Y.CharCounter(
		        {
		          counter: '#counter',
		          input: '#some-input',
		          maxLength: 20
		        }
		      );
		    }
		  );
</aui:script>

<input type="button" value="hello" onclick="aa()"/>
<aui:button class="btn btn-success" value="success"/>
<aui:button class="btn btn-primary" value="save"/>



 <input type="text" id="some-input" />
  <span id="counter"></span> character(s) remaining

 