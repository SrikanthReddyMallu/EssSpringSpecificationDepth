package com.example.Specification.Dto;


import java.util.List;


public class RequestDto {
   private SearchRequestDto searchRequestDto;

    private List<SearchRequestDto> searchRequestDto1;

    public RequestDto() {

    }

    public SearchRequestDto getSearchRequestDto() {
        return searchRequestDto;
    }

    public void setSearchRequestDto(SearchRequestDto searchRequestDto) {
        this.searchRequestDto = searchRequestDto;
    }

    public List<SearchRequestDto> getSearchRequestDto1() {
        return searchRequestDto1;
    }

    public void setSearchRequestDto1(List<SearchRequestDto> searchRequestDto1) {
        this.searchRequestDto1 = searchRequestDto1;
    }
}
