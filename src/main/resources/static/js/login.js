    //로그인 버튼 클릭 시
    $("#login_btn").on("click", function () {

        let phone = $("#phone").val();
        let pw = $("#pw").val();

        if(!phone) {
            alert("핸드폰 번호를 입력해 주세요.");
            return;
        }else if(!pw) {
            alert("비밀번호를 입력해 주세요.");
            return;
        }

        $.ajax({
            url: "/member/login",
            type  : "POST",
            data: {
                "phone": phone,
                "pw": pw
            }
        }).done(function (resp) {

//            console.log(resp);

            if (resp == false) {//핸드폰 번호, 비밀번호가 존재하지 않을 때,
                alert("핸드폰 번호 또는 비밀번호가 일치하지 않습니다.");
                $('#phone').val('');
                $('#pw').val('');
            } else if (resp == true) { //핸드폰 번호, 비밀번호가 존재할 때,
                location.href = "/";
            }
        }).fail(function() {
          	    alert("[요청 실패] 에러가 발생했습니다. 관리자에게 문의해 주세요.");
        });

    });