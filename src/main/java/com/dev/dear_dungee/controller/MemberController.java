package com.dev.dear_dungee.controller;

import com.dev.dear_dungee.common.Pw_SHA256;
import com.dev.dear_dungee.dto.MemberDTO;
import com.dev.dear_dungee.service.MemberService;
import net.nurigo.sdk.NurigoApp;
import net.nurigo.sdk.message.model.Message;
import net.nurigo.sdk.message.request.SingleMessageSendingRequest;
import net.nurigo.sdk.message.response.SingleMessageSentResponse;
import net.nurigo.sdk.message.service.DefaultMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/member/")
public class MemberController {

    //coolSMS
//    final DefaultMessageService messageService;
//
//    public MemberController() {
//        // 반드시 계정 내 등록된 유효한 API 키, API Secret Key를 입력해주셔야 합니다!
//        this.messageService = NurigoApp.INSTANCE.initialize("NCSABSHUL0OKHIDY", "TAFW3P6ETYSZO8QQUNSPWJRSQ03J7QAJ", "https://api.coolsms.co.kr");
//    }

    @Autowired
    private HttpSession session;

    @Autowired
    private MemberService memberService;

    //회원가입 페이지로 이동
    @RequestMapping("toSignup")
    public String toSignup(Model model) {

        return "member/signup";
    }

    //일반 회원가입 페이지로 이동
    @RequestMapping("toGeneralSignup")
    public String toGeneralSignup(Model model) {

        return "member/generalSignup";
    }

    //보호소 회원가입 페이지로 이동
    @RequestMapping("toShelterSignup")
    public String toShelterSignup(Model model) {

        return "member/shelterSignup";
    }

    // 인증 번호 발송
    @ResponseBody
    @RequestMapping("sendSMS")
    public String sendSMS(String phone) {
        return memberService.sendSMS(phone);
    }

    //회원가입
    @RequestMapping("signup")
    public String signup(MemberDTO dto) {

        //비밀번호 암호화
        String encryPassword = Pw_SHA256.getSHA256(dto.getPw());
        dto.setPw(encryPassword);

        //insert
        memberService.signup(dto);

        return "redirect:/member/toSignupComplete";
    }

    //회원가입 완료 페이지로 이동
    @RequestMapping("toSignupComplete")
    public String toSignupComplete(Model model) {

        return "member/signupComplete";
    }

    //로그인 페이지로 이동
    @RequestMapping("toLogin")
    public String toLogin(Model model) {

        return "member/login";
    }

    //카카오 로그인 페이지로 이동
    @RequestMapping("toKakaoLogin")
    public String toKakaoLogin(Model model) {

        return "member/kakaoLogin";
    }

    //로그인
    @ResponseBody //에이작스로 보낼 때
    @RequestMapping("login")
    public boolean login(String phone, String pw) {

        //비밀번호 암호화 후 db에 있는 암호화된 비밀번호와 맞는지 확인
        String encryPassword = Pw_SHA256.getSHA256(pw);

        System.out.println("비밀번호:" + pw);
        System.out.println("암호화된 비밀번호:" + encryPassword);

        boolean result = memberService.isLoginOk(phone, encryPassword);

        System.out.println(result);

        if (result) {

            //로그인 성공하면 id 값 가져와서 session 만들기
            String id = memberService.selectIdByPhone(phone);
            session.setAttribute("loginID", id);

            MemberDTO dto = memberService.selectMemberById(id);
            session.setAttribute("name", dto.getName());
        }

        return result;
    }

    //로그아웃
    @RequestMapping("logout")
    public String logout(String id) {
        session.invalidate();
        return "redirect:/";
    }

    //비밀번호 재설정 페이지로 이동
    @RequestMapping("toPwReset")
    public String toPwReset(Model model) {

        return "member/pwReset";
    }

    //마이페이지로 이동
    @RequestMapping("toMyPage")
    public String toMypage(Model model) {

        return "member/myPage";
    }

}
