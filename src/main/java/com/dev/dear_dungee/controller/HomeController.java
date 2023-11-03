package com.dev.dear_dungee.controller;

import com.dev.dear_dungee.dto.MemberDTO;
import com.dev.dear_dungee.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    MemberService service;

    @RequestMapping("/")
    public String home(Model model) {

        // db 연동 테스트
        String id = "def";
        MemberDTO dto = service.selectMemberById(id);
        model.addAttribute("dto", dto);
        System.out.println(dto.getName());
        return "/home.html";

    }
}
