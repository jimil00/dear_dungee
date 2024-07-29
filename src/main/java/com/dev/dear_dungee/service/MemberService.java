package com.dev.dear_dungee.service;

import com.dev.dear_dungee.dao.MemberDAO;
import com.dev.dear_dungee.dto.MemberDTO;
import com.mysql.cj.protocol.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
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

    // 로그인
    public boolean isLoginOk(String phone, String pw) {
        Map<String, String> param = new HashMap<>();
        param.put("phone", phone);
        param.put("pw", pw);

        return dao.isLoginOk(param);
    }

    //로그인 성공하면 id 값 가져와서 session 만들기
    public String selectIdByPhone(String phone) {
        return dao.selectIdByPhone(phone);
    }

    public MemberDTO selectMemberById(String member_id) {
        return dao.selectMemberById(member_id);
    }


}
