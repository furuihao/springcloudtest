package com.hao.web;

import com.hao.service.SchedualServiceHi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author hao
 * @create 2018/5/26
 * 在Web层的controller层，对外暴露一个”/hi”的API接口，
 * 通过上面定义的Feign客户端SchedualServiceHi 来消费服务
 */
/*@RestController*/
public class HiController {
    /*@Resource
    private SchedualServiceHi schedualServiceHi;*/

    /*@RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }*/

}
