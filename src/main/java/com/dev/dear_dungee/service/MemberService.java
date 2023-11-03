package com.dev.dear_dungee.service;

import com.dev.dear_dungee.dao.MemberDAO;
import com.dev.dear_dungee.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberDAO dao;

    public MemberDTO selectMemberById(String member_id) {
        return dao.selectMemberById(member_id);
    }

}
