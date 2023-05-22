package com.foodlink.foodlinkspringboot.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ResponseDto {

    private String foodName;
    private String[] ingredients;
    private String[] recipe;
}
