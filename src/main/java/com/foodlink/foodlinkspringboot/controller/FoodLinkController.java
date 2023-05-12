package com.foodlink.foodlinkspringboot.controller;

import com.foodlink.foodlinkspringboot.dto.ParamDto;
import com.foodlink.foodlinkspringboot.dto.ResponseDto;
import com.foodlink.foodlinkspringboot.service.FoodLinkService;
import com.foodlink.foodlinkspringboot.vo.RequestParamVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foodlink*")
public class FoodLinkController {

    @Autowired
    private FoodLinkService foodLinkService;

    @GetMapping("/getMenu")
    public ResponseEntity<ResponseDto> getMenu(RequestParamVo requestParamVo) {

        ParamDto requestDto = requestParamVo.makeRefiendRequest();

        ResponseDto recipe = foodLinkService.getMenu(requestDto);

       return new ResponseEntity<>(recipe, HttpStatus.OK);
    }
}
