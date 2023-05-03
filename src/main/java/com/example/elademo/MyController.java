package com.example.elademo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/getName")
    public String getName() {
        return "Hi, This is Elavazhagan Thirumalai";
    }

}
