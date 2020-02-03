package com.jun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @date 2020-01-18 20:01
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public  String  getHello(){
        return "范佳怡";
    }

}
