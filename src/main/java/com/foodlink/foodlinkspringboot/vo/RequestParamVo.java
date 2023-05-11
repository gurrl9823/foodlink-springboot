package com.foodlink.foodlinkspringboot.vo;

import com.foodlink.foodlinkspringboot.dto.ParamDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class RequestParamVo {

    private String ingredients;


    public ParamDto makeRefiendRequest() {
        return ParamDto.builder()
            .ingredients(this.ingredients)
            .build();
    }

}
