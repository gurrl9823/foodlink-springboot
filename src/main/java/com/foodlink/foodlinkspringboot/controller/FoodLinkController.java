package com.foodlink.foodlinkspringboot.controller;

import com.foodlink.foodlinkspringboot.dto.ParamDto;
import com.foodlink.foodlinkspringboot.service.FoodLinkService;
import com.foodlink.foodlinkspringboot.vo.RequestParamVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foodlink*")
public class FoodLinkController {

    @Autowired
    private FoodLinkService foodLinkService;

    @GetMapping("/getMenu")
    public String getMenu(RequestParamVo rqsParam) {

        ParamDto requestDto = rqsParam.makeRefiendRequest();

        String recipe = foodLinkService.getMenu(requestDto);

       return recipe;
    }
}
