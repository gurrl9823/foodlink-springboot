package com.foodlink.foodlinkspringboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/foodlink*")
public class FoodLinkController {

    @GetMapping("/getMenu")
    public String getMenu() {

        return "FoodLink";
    }
}
