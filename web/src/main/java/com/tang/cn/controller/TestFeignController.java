package com.tang.cn.controller;

import com.tang.cn.param.UserParam;
import com.tang.cn.service.feign.TestFeignServiceClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author tangchaochao
 * @create 2020-2020-10-14 16:38
 */
@Api(tags = "test")
@RestController
public class TestFeignController {
    @Autowired
    private TestFeignServiceClient testFeignServiceClient;

    @ApiOperation(value = "hello")
    @GetMapping(value = "/test/hello")
    public String hello(){
        return testFeignServiceClient.hello();
    }

    @ApiOperation(value = "getId")
    @GetMapping(value = "/getId")
    public String getId(@RequestParam(value = "id") String id){
        return testFeignServiceClient.getId(id);
    }

    @ApiOperation(value = "getUser")
    @PostMapping(value = "/getUser")
    public String getUser(@RequestBody UserParam userParam){
        return userParam.toString();
    }

}
