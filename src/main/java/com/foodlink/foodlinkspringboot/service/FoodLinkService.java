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

        ResponseDto recipe = foodLinkRepository.getMenu(requestDto.getIngredients());

        return recipe;
    }

}
