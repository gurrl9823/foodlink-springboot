package com.foodlink.foodlinkspringboot.repository;

import java.net.http.HttpClient;
import org.springframework.stereotype.Repository;

@Repository
public class FoodLinkRepository {

    private HttpClient httpClient = HttpClient.newHttpClient();

}
