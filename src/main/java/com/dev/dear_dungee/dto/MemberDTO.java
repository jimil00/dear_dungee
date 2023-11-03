package com.dev.dear_dungee.dto;

import java.sql.Timestamp;

public class MemberDTO {

    private String member_id;
    private String name;
    private String phone;
    private String pw;
    private Timestamp sign_date;

    public MemberDTO() {
        super();
    }

    public MemberDTO(String member_id, String name, String phone, String pw, Timestamp sign_date) {
        this.member_id = member_id;
        this.name = name;
        this.phone = phone;
        this.pw = pw;
        this.sign_date = sign_date;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public Timestamp getSign_date() {
        return sign_date;
    }

    public void setSign_date(Timestamp sign_date) {
        this.sign_date = sign_date;
    }
}
