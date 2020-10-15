package com.tang.cn.service.feign;

import com.tang.cn.param.UserParam;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author tangchaochao
 * @create 2020-2020-10-14 16:37
 */
@FeignClient(name = "boot-service", fallback = TestFeignServiceClients.TestHystrix.class)
public interface TestFeignServiceClients {

    @GetMapping(value = "/feign/hello")
    String hello();

    @GetMapping(value = "/feign/id")
    String getId(@RequestParam(value = "id") String id);
    
    @PostMapping(value = "/feign/user")
    String getUser(@RequestBody UserParam userParam);

    @Component
    public class TestHystrix implements TestFeignServiceClients {

        @Override
        public String hello() {
            return "666";
        }

        @Override
        public String getId(String id) {
            return "0";
        }

        @Override
        public String getUser(UserParam userParam) {
            return null;
        }


    }


}
