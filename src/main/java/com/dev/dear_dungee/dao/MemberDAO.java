package com.dev.dear_dungee.dao;

import com.dev.dear_dungee.dto.MemberDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

    @Autowired
    private SqlSession db;

    public MemberDTO selectMemberById(String member_id) {
        return db.selectOne("Member.selectMemberById", member_id);
    }

}
