<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<portlet:defineObjects />

<aui:script>
  AUI().use(
         'aui-button',
          function (Y) {   
           var dataV=Y.one('#<portlet:namespace/>aaa');
           //dataV.attr('disabled',"disabled");
           
            
            var origin="";
            Liferay.on(
            'planTravel1',
            function(event) {
            	alert("orgin=="+event.origin);
            	origin=event.origin;
                dataV.attr('value',origin);
            }
            );
           
           
            
          }
  );
  </aui:script>

 <aui:input name="aaa" label="data from liferay fire event" size="45" id="aaa"/>
