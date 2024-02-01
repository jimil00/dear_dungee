package com.dev.dear_dungee.controller;

import com.dev.dear_dungee.common.Pw_SHA256;
import com.dev.dear_dungee.dto.MemberDTO;
import com.dev.dear_dungee.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/")
public class MemberController {

    @Autowired
    private MemberService service;

    // 회원가입 페이지로 이동
    @RequestMapping("toSignup")
    public String toSignup(Model model) {

        return "member/generalSignup";
    }

    //회원가입
    @RequestMapping(value = "signup")
    public String signup(MemberDTO dto) {

        //비밀번호 암호화
        String encryPassword = Pw_SHA256.getSHA256(dto.getPw());
        dto.setPw(encryPassword);

        //insert
        service.signup(dto);

        return "redirect:/member/toSignupComplete";
    }
    
    // 회원가입 완료 페이지로 이동
    @RequestMapping("toSignupComplete")
    public String toSignupComplete(Model model) {

        return "member/signupComplete";
    }

    // 로그인 페이지로 이동
    @RequestMapping("toLogin")
    public String toLogin(Model model) {

        return "member/login";
    }

}
