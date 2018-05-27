package com.hao.web;

import com.hao.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author hao
 * @create 2018/5/26
 */
@RestController
public class RibbonController {
    @Resource
    private HelloService helloService;

    /**
     * 通过调用restTemplate.getForObject(“http://SERVICE-HI/hi?name=“+name,String.class)方法时，
     * 已经做了负载均衡，访问了不同的端口的服务实例
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}
