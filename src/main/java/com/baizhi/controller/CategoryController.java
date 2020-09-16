package com.baizhi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("category")
public class CategoryController {
    @Resource
    RestTemplate restTemplate;
    @RequestMapping("queryByName")
    public String querybyname(String name){
        String utl ="http://localhost:8763/book/queryBook?name="+name;
        String forObject = restTemplate.getForObject(utl, String.class);
        return forObject;
    }
}
