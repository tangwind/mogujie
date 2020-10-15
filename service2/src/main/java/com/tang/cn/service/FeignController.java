package com.tang.cn.service;

import com.tang.cn.param.UserParam;
import org.springframework.web.bind.annotation.*;

/**
 * @author tangchaochao
 * @create 2020-2020-10-14 16:29
 */
@RestController
@RequestMapping(value = "/feign")
public class FeignController {

    @GetMapping(value = "/hello")
    public String get(){
        return "hello2";
    }

    @GetMapping(value = "/id")
    public String get(@RequestParam(value = "id")String id){
        return id;
    }

    @PostMapping(value = "/user")
    public String getUser(@RequestBody UserParam userParam){
        return userParam.toString();
    }





}
