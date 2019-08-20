package com.eg.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Slf4j
public class TestController {
    @RequestMapping("/test")
    public String test(){
        log.info("coming..........");
        return "success";
    }
}
