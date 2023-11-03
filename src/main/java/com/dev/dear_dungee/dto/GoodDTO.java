package com.dev.dear_dungee.dto;

public class GoodDTO {

    private int good_id;
    private String member_id;
    private String shelter_id;

    public GoodDTO() {
        super();
    }

    public GoodDTO(int good_id, String member_id, String shelter_id) {
        this.good_id = good_id;
        this.member_id = member_id;
        this.shelter_id = shelter_id;
    }

    public int getGood_id() {
        return good_id;
    }

    public void setGood_id(int good_id) {
        this.good_id = good_id;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public String getShelter_id() {
        return shelter_id;
    }

    public void setShelter_id(String shelter_id) {
        this.shelter_id = shelter_id;
    }
}
