package com.dev.dear_dungee.controller;

import com.dev.dear_dungee.dto.SearchDTO;
import com.dev.dear_dungee.dto.ShelterDTO;
import com.dev.dear_dungee.service.ShelterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/search/")
public class SearchController {

    @Autowired
    private ShelterService shelservice;

    //검색 페이지로 이동
    @RequestMapping("toSearch")
    public String toSearch(String search_word, Model model) {

        //보호소 리스트 출력
       // List<ShelterDTO> slist = shelservice.selectShelterListBySw(search_word);

        return "search";
    }


    //검색 필터링


}
