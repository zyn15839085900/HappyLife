package com.yxwy.leyi.controller;

import com.yxwy.leyi.api.TApi;
import com.yxwy.leyi.vo.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TController {
    @Autowired
    private TApi api;

    @GetMapping("/test/hello")
    public T findAll(){
        T all = api.findAll();
        return all;
    }
}
