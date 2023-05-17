package com.foodlink.foodlinkspringboot.repository;

import com.foodlink.foodlinkspringboot.dto.ResponseDto;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class FoodLinkRepository {

    @Value("${flask.server.address}")
    private String flaskAddr;

    public ResponseDto getMenu(String ingredients) {

        String flaskUrl = flaskAddr + "?ingredients=" + ingredients;

        ResponseEntity<ResponseDto> response = new RestTemplate().getForEntity(flaskUrl, ResponseDto.class);
//        ResponseEntity<ResponseDto> response = ResponseEntity.of(Optional.of(ResponseDto.builder().foodName("김치찌개").ingredients("김치, 돼지고기").recipe("1. 고기를 익힌다. 2. 김치와 함께 볶는다.").build()));

        return response.getBody();
    }
}