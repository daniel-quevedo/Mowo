$(document).ready(function(){
    
    var option = 4;
    var url="../../AssocCourseSERVLET";
    
    
    $.ajax({
        
        type:"post",
        data:{option:option},
        url:url,
        
    success:function(result)
    {
        
        $("#listCourse").html(result);
        
    }    
    });
});