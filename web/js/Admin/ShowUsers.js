$(document).ready(function(){
    
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


function adUser(opt, cod){
    $('#adUser').submit(function(event){
        
        event.preventDefault();
        
        $('#cod').val(cod);
        
        if(opt === 2){
            
            $('#opt').val(2);
            
        }else{
            
            $('#opt').val(1);
        
        }
        
        $("#adUser").unbind("submit").submit();
        
    });
    
}


