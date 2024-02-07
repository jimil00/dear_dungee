package com.dev.dear_dungee.controller;

import com.dev.dear_dungee.dto.MemberDTO;
import com.dev.dear_dungee.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @Autowired
    private HttpSession session;

    @Autowired
    MemberService service;

    @RequestMapping("/")
    public String home(Model model) {

        return "home";

    }
}
