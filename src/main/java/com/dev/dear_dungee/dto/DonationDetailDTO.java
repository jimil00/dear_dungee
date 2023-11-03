package com.dev.dear_dungee.dto;

public class DonationDetailDTO {

    private int detail_id;
    private int count;
    private int donation_id;
    private int item_id;

    public DonationDetailDTO() {
        super();
    }

    public DonationDetailDTO(int detail_id, int count, int donation_id, int item_id) {
        this.detail_id = detail_id;
        this.count = count;
        this.donation_id = donation_id;
        this.item_id = item_id;
    }

    public int getDetail_id() {
        return detail_id;
    }

    public void setDetail_id(int detail_id) {
        this.detail_id = detail_id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getDonation_id() {
        return donation_id;
    }

    public void setDonation_id(int donation_id) {
        this.donation_id = donation_id;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }
}
