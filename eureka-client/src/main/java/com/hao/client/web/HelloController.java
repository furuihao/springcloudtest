package com.hao.client.web;

import com.hao.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gcb on 2018/5/16.
 */
@RestController
public class HelloController implements SchedualServiceHi {

    @Value("${server.port}")
    private String port;

    /*@RequestMapping("/hi")*/
    public String home(@RequestParam String name) {
        return "hi " + name + ",i am from port:" + port;
    }

    @Override
    public String sayHiFromClientOne(String name) {
        return "hi " + name + ",i am from port:" + port;
    }
}
