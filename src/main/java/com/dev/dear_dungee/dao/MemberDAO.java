package com.dev.dear_dungee.dao;

import com.dev.dear_dungee.dto.MemberDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class MemberDAO {

    @Autowired
    private SqlSession db;

    // 회원가입
    public int signup(MemberDTO dto) {
        return db.insert("Member.signup", dto);
    }

    // 로그인
    public boolean isLoginOk(Map<String, String> param){
        return db.selectOne("Member.isLoginOk",param);
    }

    // id로 세션값 주기
    public String selectIdByPhone(String phone) {
        return db.selectOne("Member.selectIdByPhone", phone);
    }

    public MemberDTO selectMemberById(String member_id) {
        return db.selectOne("Member.selectMemberById", member_id);
    }

}
