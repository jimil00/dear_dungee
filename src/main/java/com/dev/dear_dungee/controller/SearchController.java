package com.dev.dear_dungee.controller;

import com.dev.dear_dungee.dto.SearchFilterDTO;
import com.dev.dear_dungee.dto.ShelterDTO;
import com.dev.dear_dungee.service.ShelterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/search/")
public class SearchController {

    @Autowired
    private ShelterService shelservice;


    //검색어 입력 및 검색조건 선택 후 검색 페이지로 이동
    @RequestMapping("ToSearch")
    public String ToSearch(SearchFilterDTO search_word, Model model) {

        model.addAttribute("search_word", search_word);

        //보호소 리스트 출력
       List<ShelterDTO> slist = shelservice.selectShelterListBySw(search_word);

       model.addAttribute("slist", slist);

        return "search/search";
    }


}
