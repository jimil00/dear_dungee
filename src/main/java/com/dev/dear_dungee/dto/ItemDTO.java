package com.dev.dear_dungee.dto;

public class ItemDTO {

    private int item_id;
    private String item_name;
    private int count;
    private String shelter_id;
    private int category_id;

    public ItemDTO() {
        super();
    }

    public ItemDTO(int item_id, String item_name, int count, String shelter_id, int category_id) {
        this.item_id = item_id;
        this.item_name = item_name;
        this.count = count;
        this.shelter_id = shelter_id;
        this.category_id = category_id;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getShelter_id() {
        return shelter_id;
    }

    public void setShelter_id(String shelter_id) {
        this.shelter_id = shelter_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
}
