package com.example.demo.controller;

import com.example.demo.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2020/5/1.
 */
@RestController
public class HiControler {

    @Autowired
    HiService hiService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return hiService.hiService( name )+" ribbon";
    }

}
