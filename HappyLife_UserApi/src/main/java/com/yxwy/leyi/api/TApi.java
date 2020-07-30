package com.yxwy.leyi.api;

import com.yxwy.leyi.vo.T;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("UserProvider")
public interface TApi {
    @GetMapping("/test/hello")
    public T findAll();
}
