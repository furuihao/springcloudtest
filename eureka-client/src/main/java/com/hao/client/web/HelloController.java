package com.hao.client.web;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by gcb on 2018/5/16.
 * @author hao
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @Resource
    private DiscoveryClient client ;

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        ServiceInstance instance = client.getLocalServiceInstance();
        System.out.println("host："+instance.getHost()+",service_id:"+instance.getServiceId());
        return "hi " + name + ",i am from port:" + port;
    }


}
