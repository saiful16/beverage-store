package com.beverage.store.controller;

import com.beverage.store.service.BottleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BottleController {

    private BottleService bottleService;

    public BottleController(BottleService bottleService) {
        this.bottleService = bottleService;
    }

    @GetMapping("/bottle")
    public String getBottle(){
        System.out.println(bottleService.getAll());
        return "bottle";
    }
}
