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

