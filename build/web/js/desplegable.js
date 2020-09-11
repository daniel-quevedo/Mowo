$(document).ready(function(){
    $('.submenu >li >a').click(function(e){
               e.preventDefault();
               
    });
   $('.submenu li:has(ul)').click(function(){
        if ($(this).hasClass('active')) {
            $(this).removeClass('active');
            $(this).children('ul').slideUp();
        }else {
            $('.submenu >li >ul').slideUp();
            $('.submenu >li').removeClass('active');
            $(this).addClass('active');
            $(this).children('ul').slideDown();
        }
   });
});

$('.menu-bar').on('click', function() {
  if ($('.btn-group').hasClass('remove')) {
    $('.btn-group').removeClass('remove');
    $('.btn-group').addClass('his');
    $('.btn-group').hide();
  }else {    
    $('.btn-group').removeClass('his');        
    $('.btn-group').addClass('remove');
    $('.btn-group').show();
  }
});

