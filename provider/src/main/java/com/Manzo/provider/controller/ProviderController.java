package com.Manzo.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author holland
 * @create 2022-05-19 16:22
 */
@RestController
public class ProviderController {

    @Value("${myName}")
    private String myName;

    @Value("${redis1.url}")
    private String redisUrl;

    @Value("${mysql.url}")
    private String mysqlUrl;

    @GetMapping("/hello")
    public String hello(){
        int i = 1/ 0;
        return "hello" + myName + "redis: " + redisUrl + "mysqlUrl: " + mysqlUrl;
    }
}
