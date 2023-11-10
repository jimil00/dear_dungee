package com.dev.dear_dungee.controller;

import com.dev.dear_dungee.dto.SearchDTO;
import com.dev.dear_dungee.dto.ShelterDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/search/")
public class SearchController {

    //검색 페이지로 이동
    @RequestMapping("toSearch")
    public String toSearch(String search_word, Model model) {

        return "search";
    }

    //보호소 리스트 조회


    //검색 필터링


}
