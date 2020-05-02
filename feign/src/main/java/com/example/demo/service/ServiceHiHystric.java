package com.example.demo.service;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2020/5/2.
 */
@Component
public class ServiceHiHystric implements ServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
