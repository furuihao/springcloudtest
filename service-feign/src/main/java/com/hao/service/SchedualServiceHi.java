package com.hao.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hao
 * @create 2018/5/26
 * 定义一个feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务。
        * 比如在代码中调用了service-hi服务的“/hi”接口
        */
@FeignClient(value = "service-hi")
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
