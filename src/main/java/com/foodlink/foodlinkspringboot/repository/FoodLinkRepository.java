package com.foodlink.foodlinkspringboot.repository;

import com.foodlink.foodlinkspringboot.dto.ResponseDto;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;


@Repository
public class FoodLinkRepository {

    @Value("${flask.server.address}")
    private String flaskAddr;

    public List<ResponseDto> getMenu(String ingredients) {

        String flaskUrl = flaskAddr + "?ingredients=" + ingredients;

        List<ResponseDto> response = new RestTemplate().getForObject(flaskUrl, List.class);
        if (response == null) {
            return List.of(ResponseDto.builder().foodName("").ingredients(List.of("")).recipe(List.of("")).build());
        }

        return response;
    }
}