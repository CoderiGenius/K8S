package com.example.k8s.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CoderiGenius
 * @version 2022/4/18 21:41
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "hello world";
    }
}
