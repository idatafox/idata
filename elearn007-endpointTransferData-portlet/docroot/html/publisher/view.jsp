<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %> 
<portlet:defineObjects />
<aui:script>
  AUI().use(
         'aui-button',
          function (Y) {  
          
           var dataV=Y.one('#<portlet:namespace/>apos');
          
		   var fireButton=Y.one('#firePublish');
		   
				   fireButton.on(
				   'click',
				   function(event){
				       var address=dataV.get("value");
				       Liferay.fire(
						          'planTravel1', {
						          origin: address,
						          destination : 'mumbai'
		                     }
		                );
				   }
				   );
		          
           
          }

     );
  
</aui:script>

 <aui:input name="apos" label="data from liferay fire event" size="45" value="beijing" id="apos"/>

<button id="firePublish" class="btn btn-primary">Fire Event</button>




