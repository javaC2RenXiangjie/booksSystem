$('#myModal').modal("show");
$('#accountInfoModal').modal("show");

//登录按钮功能
function login(){
    var account = {
    accountString: $("#account").val()
    };

    //账号密码输入格式前台验证
    var validateNum = function(){
        if(!account.accountString){
            alert("不能为空！！！")
            $("#account").val("")
            $("#password").val("")
            return "0"
        }else {
            return "1"
        }
    }()

    //向后台发送信息比较
    if (validateNum == "1") {
        var url = "/user/" + account.accountString
        $.post(url, function(data, status) {
            if (data == true) {
                alert("发送后台验证成功")
            } else {
                alert("账号或密码输入不正确，请重新输入！")
            }
        });
    }
};