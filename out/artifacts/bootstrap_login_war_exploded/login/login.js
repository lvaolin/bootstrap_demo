/**
 * Created by admin on 2016/5/16.
 */

$(function(){
    $("#mid").on("blur",function(){
        validagteMid();
    });
    $("#password").on("blur",function(){
        validagtePassword();
    });

    $("#loginForm").on("submit",function(){
        return validagteMid()&&validagtePassword();
    });

    function validagteMid(){
        return validateEmpty("mid");
    }

    function validagtePassword(){
        return validateEmpty("password");
    }


    function validateEmpty(eleId){
        if($("#"+eleId).val()==""){
            $("#"+eleId+"Div").attr("class","form-group has-error");
            $("#"+eleId+"Span").html("<span class='text-danger'>该字段的内容不允许为空！</span>");
            return false;
        }else{
            $("#"+eleId+"Div").attr("class","form-group has-success");
            $("#"+eleId+"Span").html("<span class='text-success'>该字段的内容输入合法！</span>");
            return true;
        }
    }
});