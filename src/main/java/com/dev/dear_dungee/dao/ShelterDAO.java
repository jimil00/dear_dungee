package com.dev.dear_dungee.dao;

import com.dev.dear_dungee.dto.SearchFilterDTO;
import com.dev.dear_dungee.dto.ShelterDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ShelterDAO {

    @Autowired
    private SqlSession db;

    //검색어로 select
    public List<ShelterDTO> selectShelterListBySw(SearchFilterDTO search_word){
        return db.selectList("Shelter.selectShelterListBySw",search_word);
    }

}
