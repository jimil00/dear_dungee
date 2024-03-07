    // 핸드폰 번호 숫자만 입력시키는 함수 (이게 꼭 필요할까?)
    // function inputNum(id) {
    //     let phone = document.getElementById('phone');
    //     phone.value = phone.value.replace(/[^0-9]/gi, "");
    // }

	let phoneValue = ""; // 초기값 세팅
	let phoneRegex = /^01\d\d{4}\d{4}$/;
	let pwValue = "";
	let pwRegex = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,}$/;


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

    // 비밀번호 확인 함수
    let pwchk = document.getElementById("pwchk");
    let pwchkResult = document.getElementById("pwchkResult");

    pwchk.onkeyup = function () {
        let pwValue = document.getElementById("pw").value;
        let pwchkValue = document.getElementById("pwchk").value;

        if (pwValue == pwchkValue) {
            pwchk.style.border = "2px solid blue";
            pwchkResult.innerHTML = "";
        } else {
            pwchk.style.border = "2px solid red";
            pwchkResult.innerHTML = "비밀번호가 일치하지 않습니다.";
        }
    };

    // 유효성 검사에 맞지 않는다면 회원가입 버튼 비활성화
//    $("#signup_btn").on("click", function () {
//        let phone = document.getElementById("phone");
//        let phoneRegex = /^01\d\d{4}\d{4}$/;
//
//        if(phone == "" || !phoneRegex.test(phone)) {
//            console.log("false");
//            return false;
//        }else
//            return true;
//   });


    frm.onsubmit = function() {

//			let id = document.getElementById("id").value;
//			let idRegex = /^[a-z0-9_]{8,14}$/;
//
//			let idResult = idRegex.test(id.value);
//
//
//
//			let pwResult = pwRegex.test(pw);
//
//			let pwchk = document.getElementById("pwchk").value;
//
//			let name = document.getElementById("name").value;
//
//			let nameRegex = /^[가-힣]{2,5}$/;
//
//			let nameResult = nameRegex.test(name);

			if (phoneValue == "" || !phoneRegex.test(phoneValue)) {
                    console.log(phoneValue);
                    phone.style.border = "2px solid red";
                    return false;
				}

				if (pwValue == "" || !pwRegex.test(pwValue)) {
                                           pw.style.border = "2px solid red";
                                           return false;
                                       }


		}