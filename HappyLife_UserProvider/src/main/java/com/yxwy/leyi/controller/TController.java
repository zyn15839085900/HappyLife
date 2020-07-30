package com.yxwy.leyi.controller;

import com.yxwy.leyi.entity.T;
import com.yxwy.leyi.service.TService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TController {
    @Resource
    private TService service;

    @GetMapping("/test/hello")
    public T findAll(){
        return service.findAll();
    }
}
