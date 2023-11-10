package com.dev.dear_dungee.service;


import com.dev.dear_dungee.dao.ShelterDAO;
import com.dev.dear_dungee.dto.ShelterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShelterService {

    @Autowired
    private ShelterDAO dao;

    //검색어로 보호소 출력
    public List<ShelterDTO> selectAllbySearchWord(String search_word){

        return dao.selectAllbySearchWord(search_word);
    }

    //이름으로 보호소 출력
    public List<ShelterDTO> selectAllbyName(String shelter_name){

        return dao.selectAllbyName(shelter_name);
    }

    //주소로 보호소 출력
    public List<ShelterDTO> selectAllbyAddress(String shelter_address){

        return dao.selectAllbyAddress(shelter_address);
    }

    //필요물품으로 보호소 출력
    public List<ShelterDTO> selectAllbyItem(String item_name){

        return dao.selectAllbyItem(item_name);
    }



}
