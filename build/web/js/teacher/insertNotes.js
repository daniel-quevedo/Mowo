$(document).ready(function(){
    
    var option = 1;
    var url="../../OtherSERVLET";
    
    $.ajax({
        
        type:"post",
        data:{codUser: $('#cod').val(), Option:option, codProfile: $('#idProfile').val()},
        url:url,
        
    success:function(result)
    {
     
        $("#Course").html(result);
        
    }    
    });
    

});

function encontrar(){
    
    var option = 2;
    var url="../../OtherSERVLET";

    $.ajax
      ({
          type:"post",
          data:{Course:$('#course').val(), Option:option, codUser: $('#cod').val(), codProfile: $('#idProfile').val()},
          url:url,
      success:function(result)
      {
          $("#subjects").html(result);
      }
      });


      $('select').on('click', function(){
          $('select').removeAttr('disabled');
      });

};



function students(){
    
    var option = 3;
    var url="../../OtherSERVLET";
    
    $.ajax
      ({
          type:"post",
          data:{Course: $('#course').val(), Option:option, subject: $('#subjects').val(), codUser: $('#cod').val(), codProfile: $('#idProfile').val()},
          url:url,
          
      success:function(result)
      {
          $("#notes").html(result);
      }
      });
}


function modal(val) {

    var course = $('#course').val();
    var subject = $('#subjects').val();
    var student = 1;
    
    
    var codUser = val;
    
    $('#modSubject').html("<input type='hidden' id='id_subject' name='id_subject' value=" + subject + ">");
    $('#modStudent').html("<input type='hidden' id='id_user' name='id_user' value=" + codUser + ">");


}

//function notes(){
//    
//    var note1 = $('#note1').val();
//    var note2 = $('#note2').val();
//    var note3 = $('#note3').val();
//    var note4 = $('#note4').val();
//    var id_course = $('#id_course').val();
//    var id_subject = $('#id_subject').val();
//    var id_user = $('#id_user').val();
//
//    
//    var url ="../../NotesSERVLET";
//    
//    $.ajax
//    ({
//       
//        type: "post",
//        data: {n1:note1, n2:note2, n3:note3, n4:note4, id_course:id_course, id_subj:id_subject, id_user:id_user},
//        url: url,
//    
//    success:function(result){
//        
//        alert(result);
//        
//    },
//    error:function(){
//        
//        alert('ocurrio un error inesperado');
//    }
//        
//    });
//    
//}