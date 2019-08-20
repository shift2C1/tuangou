package com.eg.test.controller;

import com.eg.test.mapper.AreaMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Slf4j
public class TestController {
    /**
     *
     */
    @Autowired
    private AreaMapper areaMapper;
    @RequestMapping("/test")
    public String test(){
        log.info("coming..........");
        return areaMapper.selectByExample(null).toString();
//        return "success";
    }
}
