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
