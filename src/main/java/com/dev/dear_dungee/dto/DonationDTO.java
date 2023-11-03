package com.dev.dear_dungee.dto;

import java.sql.Timestamp;

public class DonationDTO {

    private int donation_id;
    private String status;
    private Timestamp application_date;
    private Timestamp completion_date;
    private String member_id;
    private String shelter_id;

    public DonationDTO() {
        super();
    }

    public DonationDTO(int donation_id, String status, Timestamp application_date, Timestamp completion_date, String member_id, String shelter_id) {
        this.donation_id = donation_id;
        this.status = status;
        this.application_date = application_date;
        this.completion_date = completion_date;
        this.member_id = member_id;
        this.shelter_id = shelter_id;
    }

    public int getDonation_id() {
        return donation_id;
    }

    public void setDonation_id(int donation_id) {
        this.donation_id = donation_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getApplication_date() {
        return application_date;
    }

    public void setApplication_date(Timestamp application_date) {
        this.application_date = application_date;
    }

    public Timestamp getCompletion_date() {
        return completion_date;
    }

    public void setCompletion_date(Timestamp completion_date) {
        this.completion_date = completion_date;
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
