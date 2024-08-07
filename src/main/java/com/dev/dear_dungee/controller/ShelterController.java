package com.dev.dear_dungee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shelter/")
public class ShelterController {

    //보호소 상세 페이지로 이동
    @RequestMapping("toDetail")
    public String toDetail(Model model) {

        return "shelter/detail";
    }

    //보호소 마이페이지로 이동
    @RequestMapping("toMyPage")
    public String toMyPage(Model model) {

        return "shelter/myPage";
    }
}
