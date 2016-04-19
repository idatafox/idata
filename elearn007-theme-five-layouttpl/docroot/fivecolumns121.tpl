<div style="background-color:#000;font-size:16px;color:#fff;height:40px;margin-bottom:20px;">
  [用户基本信息]
  $user.getCompanyId()/$user.getBirthday()/$user.getDisplayEmailAddress()/$user.getCompanyMx()
</div>


<div class="fivecolumns121" id="main-content" role="main">
        <div class="portlet-layout row-fluid">
                <div class="portlet-column portlet-column-only span12" id="column-1">
                   
                        $processor.processPortlet("helloelearn007_WAR_elearn007portletsfiveportlet")
                        
                        
                        $processor.processColumn("column-1", 
                        "portlet-column-content portlet-column-content-only")
                </div>
        </div>

        <div class="portlet-layout row-fluid">
                <div class="portlet-column portlet-column-first span6" id="column-2">
                
                        $processor.processPortlet("71_INSTANCE_xyz1")
                        
                        $processor.processColumn("column-2", 
                        "portlet-column-content portlet-column-content-first")
                </div>
                
                 <div class="portlet-column portlet-column-last span6" id="column-3">
                        $processor.processColumn("column-3", "portlet-column-content portlet-column-content-last")
                </div>
                
                
               
        </div>

        <div class="portlet-layout row-fluid">
                <div class="portlet-column portlet-column-only span12" id="column-4">
                        $processor.processColumn("column-4", "portlet-column-content portlet-column-content-only")
                </div>
        </div>
</div>

