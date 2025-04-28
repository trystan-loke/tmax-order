package com.tmax.order.controller;

import com.tmax.common.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/capitalize")
    public String capitalize(@RequestParam String input) {
        return StringUtils.capitalize(input);
    }
} 