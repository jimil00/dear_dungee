package com.dev.dear_dungee.service;

import com.dev.dear_dungee.dao.MemberDAO;
import com.dev.dear_dungee.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MemberService {

    @Autowired
    private MemberDAO dao;

    // 회원가입
    public void signup(MemberDTO dto) {

        //uuid 생성
        String member_id = UUID.randomUUID().toString();
        dto.setMember_id(member_id);

        dao.signup(dto);
    }

    public MemberDTO selectMemberById(String member_id) {
        return dao.selectMemberById(member_id);
    }

}
