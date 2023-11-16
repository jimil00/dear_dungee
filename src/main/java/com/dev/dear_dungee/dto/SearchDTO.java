package com.dev.dear_dungee.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchDTO {

    private int page; //현재 페이지 번호
    private int record_size; //페이지 당 출력할 데이터 개수
    private int page_size; //화면 하단에 출력할 페이지 사이즈
    private String keyword; //검색어
    private String search_type; //검색 유형

    //생성자 : 객체 생성 시점에 현재 페이지 번호 1, 페이지당 출력 데이터와 하단 출력 페이지 개수 10개로 초기화
    public SearchDTO() {
        this.page = 1;
        this.record_size = 10;
        this.page_size = 10;
    }


}
