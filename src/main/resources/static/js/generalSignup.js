// 핸드폰 번호 숫자만 입력시키는 함수 (이게 꼭 필요할까?)
// function inputNum(id) {
//     let phone = document.getElementById('phone');
//     phone.value = phone.value.replace(/[^0-9]/gi, "");
// }

//초기값 세팅
let usernameValue="";
let phoneValue = "";
let phoneRegex = /^01\d\d{4}\d{4}$/;
let pwValue = "";
let pwRegex = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,}$/;
let pwchkValue = "";
let certification_num = "";

// 이름 확인
username.onkeyup = function () {
    usernameValue = document.getElementById("username").value;
    console.log(usernameValue);

    if (usernameValue=="") {
        username.style.border = "2px solid red";
    } else {
        username.style.border = "2px solid blue";
    }
};

// 핸드폰 번호 유효성 검사
phone.onkeyup = function () {
    phoneValue = document.getElementById("phone").value;
    let result = phoneRegex.test(phoneValue);
    console.log(phoneValue);

    if (result) {
        phone.style.border = "2px solid blue";
        phoneResult.innerHTML = "";

    } else {
        phone.style.border = "2px solid red";
        phoneResult.innerHTML = "-을 제외한 휴대폰 번호만 입력해주세요.";
    }
}

// 핸드폰 번호 인증
$(".certification_btn").click(function() {

    phoneValue = document.getElementById("phone").value;

	if(phoneValue=="") {
	    phone.onkeyup();
	    return false;
	}

    //	const phone = $("#phone").val();

	$.ajax ({
		url: "/member/sendSMS",
		type: "POST",
		data: {
			"phone" : phoneValue
		},
		success: function(result) { // 성공 시 randomNum값 반환
			const random_num = result;
			alert("인증번호: "+ random_num);

			$(".check_btn").click(function() {
				const certification_num = $("#certification_num").val();

				if(random_num === certification_num) {
					alert('핸드폰 인증이 완료되었습니다.');
                    $("#phone").attr("disabled", true);
                    $(".certification_btn").attr("disabled", true);
				}
				else {
					alert('인증번호가 올바르지 않습니다. 다시 입력해 주세요.');
				}
			});

		}
	});

});

// 비밀번호 유효성 검사
//  8글자 이상, 영문, 숫자, 특수문자 사용
// /^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,}$/
pw.onkeyup = function () {
    pwValue = document.getElementById("pw").value;
    let result = pwRegex.test(pwValue);

    if (result) {
        pw.style.border = "2px solid blue";
        pwResult.innerHTML = "";

    } else {
        pw.style.border = "2px solid red";
        pwResult.innerHTML = "8자 이상의 영문, 숫자, 특수문자를 사용해주세요.";
    }
}

// 비밀번호 확인
pwchk.onkeyup = function () {
    pwchkValue = document.getElementById("pwchk").value;

    if (pwchkValue=="") {
        pwchk.style.border = "2px solid red";
        pwchkResult.innerHTML = "비밀번호를 입력해주세요.";
    } else if(pwValue == pwchkValue) {
         pwchk.style.border = "2px solid blue";
         pwchkResult.innerHTML = "";
    } else {
        pwchk.style.border = "2px solid red";
        pwchkResult.innerHTML = "비밀번호가 일치하지 않습니다.";
    }
};

// 회원가입 버튼 클릭 시
frm.onsubmit = function() {

    $("#phone").attr("disabled", false);
    $(".certification_btn").attr("disabled", false);

    if(usernameValue=="") {
        username.onkeyup();
    }

    if (!phoneRegex.test(phoneValue)) {
        console.log(phoneValue);
        phone.onkeyup();
    }

    if (!pwRegex.test(pwValue)) {
         console.log(pwValue);
         pw.onkeyup();
    }

    if (pwchkValue=="") {
         console.log(pwchkValue);
         pwchk.onkeyup();
    }

    if (usernameValue=="" || !phoneRegex.test(phoneValue) || !pwRegex.test(pwValue) || pwchkValue=="" || pwValue != pwchkValue) {
         return false;
    }

//    if(certification_num=="") {
//        alert("핸드폰 인증을 완료해 주세요.");
//        return false;
//    }

}