package com.foodlink.foodlinkspringboot.dto;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {

    private String foodName;
    private List<String> ingredients;
    private List<String> recipe;
}
