package com.dev.dear_dungee.controller;

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

    @RequestMapping("toSignup")
    public String toSignup(Model model) {

//        String id = "def";
//        MemberDTO dto = service.selectMemberById(id);
//        model.addAttribute("dto", dto);
//
//        System.out.println(dto.getName());

        return "member/generalSignup";
    }

    @RequestMapping("toLogin")
    public String toLogin(Model model) {

        return "member/login";
    }


}
