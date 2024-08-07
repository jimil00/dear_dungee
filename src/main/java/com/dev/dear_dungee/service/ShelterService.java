package com.dev.dear_dungee.service;


import com.dev.dear_dungee.dao.ShelterDAO;
import com.dev.dear_dungee.dto.SearchFilterDTO;
import com.dev.dear_dungee.dto.ShelterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShelterService {

    @Autowired
    private ShelterDAO dao;

    //검색어로 보호소 출력
    public List<ShelterDTO> selectShelterListBySw(SearchFilterDTO search_word){
        return dao.selectShelterListBySw(search_word);
    }

}
