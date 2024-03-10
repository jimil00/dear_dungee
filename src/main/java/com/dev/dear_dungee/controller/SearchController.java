package com.dev.dear_dungee.controller;

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
    @RequestMapping("ToSearch")
    public String ToSearch(String search_word, Model model) {

        model.addAttribute("search_word", search_word);

        //보호소 리스트 출력
       List<ShelterDTO> slist = shelservice.selectShelterListBySw(search_word);

       model.addAttribute("slist", slist);


        return "search/search";
    }

    //페이징 처리
    //public PageInfo<>


    //검색 필터링(지역, 필요물품)
    //검색어랑 검색조건이 같이 넘어가야 함 / 다중검색조건은 여러 개의 값이 넘어가야 함 -> list /


}
