package com.tang.cn.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tangchaochao
 * @create 2020-2020-10-16 15:05
 */
@RestController
public class TestConfigController {
    @Value("${test.config}")
    private String testConfig;

    @GetMapping(value = "/showConfig")
    public String show(){
        return testConfig;
    }
}
