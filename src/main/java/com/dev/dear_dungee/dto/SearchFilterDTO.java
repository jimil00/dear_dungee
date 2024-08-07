package com.dev.dear_dungee.dto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SearchFilterDTO {

    private String[] regionList;
    private String[] itemList;
    private String region;
    private String item;
    private String search_word;

}


