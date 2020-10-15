package com.tang.cn.controller;

import com.tang.cn.param.UserParam;
import com.tang.cn.service.feign.TestFeignServiceClients;
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
    private TestFeignServiceClients testFeignServiceClients;

    @ApiOperation(value = "hello")
    @GetMapping(value = "/hello")
    public String hello(){
        return testFeignServiceClients.hello();
    }

    @ApiOperation(value = "getId")
    @GetMapping(value = "/getId")
    public String getId(@RequestParam(value = "id") String id){
        return testFeignServiceClients.getId(id);
    }

    @ApiOperation(value = "getUser")
    @PostMapping(value = "/getUser")
    public String getUser(@RequestBody UserParam userParam){
        return userParam.toString();
    }

}
