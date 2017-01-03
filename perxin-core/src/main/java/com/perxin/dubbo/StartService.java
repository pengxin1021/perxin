package com.perxin.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 启动服务的提供者
 * Created by perxin on 2016/12/26.
 */
public class StartService {

    public static void main(String[] args) throws InterruptedException{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-dubbo-provider.xml");
        context.start();
        System.out.println("Service started!");
        while (true) {
            Thread.sleep(1000);
        }
    }

}
