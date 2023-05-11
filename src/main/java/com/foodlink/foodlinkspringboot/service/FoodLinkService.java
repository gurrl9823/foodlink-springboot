package com.foodlink.foodlinkspringboot.service;

import com.foodlink.foodlinkspringboot.dto.ParamDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FoodLinkService {

    public String getMenu(ParamDto rqsDto) {

        return "menu";
    }

}
