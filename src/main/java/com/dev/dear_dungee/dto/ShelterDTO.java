package com.dev.dear_dungee.dto;

public class ShelterDTO {

    private String shelter_id;
    private String shelter_name;
    private String shelter_phone;
    private String shelter_address;
    private String manager_name;
    private String manager_phone;
    private String pw;

    public ShelterDTO() {
        super();
    }

    public ShelterDTO(String shelter_id, String shelter_name, String shelter_phone, String shelter_address, String manager_name, String manager_phone, String pw) {
        this.shelter_id = shelter_id;
        this.shelter_name = shelter_name;
        this.shelter_phone = shelter_phone;
        this.shelter_address = shelter_address;
        this.manager_name = manager_name;
        this.manager_phone = manager_phone;
        this.pw = pw;
    }

    public String getShelter_id() {
        return shelter_id;
    }

    public void setShelter_id(String shelter_id) {
        this.shelter_id = shelter_id;
    }

    public String getShelter_name() {
        return shelter_name;
    }

    public void setShelter_name(String shelter_name) {
        this.shelter_name = shelter_name;
    }

    public String getShelter_phone() {
        return shelter_phone;
    }

    public void setShelter_phone(String shelter_phone) {
        this.shelter_phone = shelter_phone;
    }

    public String getShelter_address() {
        return shelter_address;
    }

    public void setShelter_address(String shelter_address) {
        this.shelter_address = shelter_address;
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    public String getManager_phone() {
        return manager_phone;
    }

    public void setManager_phone(String manager_phone) {
        this.manager_phone = manager_phone;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
