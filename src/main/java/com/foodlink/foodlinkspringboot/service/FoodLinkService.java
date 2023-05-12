package com.foodlink.foodlinkspringboot.service;

import com.foodlink.foodlinkspringboot.dto.ParamDto;
import com.foodlink.foodlinkspringboot.dto.ResponseDto;
import com.foodlink.foodlinkspringboot.repository.FoodLinkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FoodLinkService {

    @Autowired
    private FoodLinkRepository foodLinkRepository;

    public ResponseDto getMenu(ParamDto requestDto) {

        return ResponseDto.builder().foodName("김치찌개").ingredients("김치, 돼지고기").recipe("1. 고기를 익힌다. 2. 김치와 함께 볶는다.").build();
    }

}
