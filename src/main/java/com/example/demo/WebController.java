package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: web_demo
 * @description:
 * @author: zoupan
 * @version: 1.0
 * @create: 2020-11-29 23:40
 **/

@RestController
public class WebController {

    @GetMapping("/web")
    public String web(){
        System.out.println("xxx");
        return "web_demo";
    }

}
