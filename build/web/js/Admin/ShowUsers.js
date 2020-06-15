$(document).ready(function(){
    
    //alert("hello");
    
    $.ajax({
        
        type:"post",
        data:{option:3},
        url: "../../CrudUserSERVLET",
        
        success:function(res){
            
            $("#dataUser").html(res);
            
        },
        
        error:function(){
            
            alert('ocurrio un error al mostrar los usuarios');
            
        }
       
        
    });
    
});

