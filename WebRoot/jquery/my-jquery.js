
$(document).ready(function(){
        var $loading = $('');
        $(document).ajaxStart(function(){
            $loading.show();
        });

        $(document).ajaxStop(function(){
            $loading.hide();
        });

        //提交表单
        $('form').submit(function(event){
            event.preventDefault();
            var formvalues = $(this).serialize();
            $.post('login.action',formvalues,function(data){
                if(data=='SUCCESS')
                {
                    window.location.href="./success.jsp";
                }
                else {
                    $('div.panel-body').html('<div class="alert alert-danger" role="alert"></div>');
                    $('div.alert').html(data);
                }
            });
        });
});

$('.dropdown-toggle').dropdown();



