package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:TestController
 * @Description:TODO
 * @author:zgw
 * @date:2022/7/24 20:42
 */
@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/info")
    public String hello(){
        return "hello,world2";
    }
}
