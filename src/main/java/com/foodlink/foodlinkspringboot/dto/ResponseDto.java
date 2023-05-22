package com.foodlink.foodlinkspringboot.dto;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {

    private String foodName;
    private String[] ingredients;
    private String[] recipe;
}
