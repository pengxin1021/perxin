package com.perxin.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.perxin.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by perxin on 2016/12/28.
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @Reference
    private DemoService demoService;

    @ResponseBody
    @RequestMapping(value = "/demo")
    public String demo() {
        System.out.println(demoService.sayHello("laji"));
        return demoService.sayHello("aiuhfhf");
    }
}
