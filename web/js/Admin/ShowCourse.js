function modalCourse(cod){
 
    var opt = 3;
    
    $.ajax({
        
        type: "post",
        data:{option:opt, cod:cod},
        url: "../../AssocCourseSERVLET",
        
        success:function(value){
            
            $('#tableCourse').html(value);
            //alert(value);
            
        },
        error:function(){
            
            alert("ocurrio un error al mostrar las datos del usuario");
            
        }
        
    });
}
