package com.foodlink.foodlinkspringboot.service;

import com.foodlink.foodlinkspringboot.dto.ParamDto;
import com.foodlink.foodlinkspringboot.dto.ResponseDto;
import com.foodlink.foodlinkspringboot.repository.FoodLinkRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FoodLinkService {

    @Autowired
    private FoodLinkRepository foodLinkRepository;

    public List<ResponseDto> getMenu(ParamDto requestDto) {

        // param으로 들어온 재료가 저장소에 있는 재료명에 있는지 체크

        List<ResponseDto> recipe = foodLinkRepository.getMenu(requestDto.getIngredients());

        return recipe;
    }

}
