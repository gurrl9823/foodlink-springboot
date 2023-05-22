package com.foodlink.foodlinkspringboot.repository;

import com.foodlink.foodlinkspringboot.dto.ResponseDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class FoodLinkRepository {

    @Value("${flask.server.address}")
    private String flaskAddr;

    public ResponseDto[] getMenu(String ingredients) {

        String flaskUrl = flaskAddr + "?ingredients=" + ingredients;

        ResponseDto[] response = new RestTemplate().getForObject(flaskUrl, ResponseDto[].class);
        if (response == null) {
            return new ResponseDto[]{ResponseDto.builder().foodName("").ingredients(new String[]{""}).recipe(new String[]{""}).build()};
        }

        return response;
    }
}