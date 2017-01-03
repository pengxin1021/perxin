package com.perxin.service.impl;

import com.alibaba.dubbo.rpc.RpcContext;
import com.perxin.service.DemoService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by perxin on 2016/12/26.
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return name;
    }
}
