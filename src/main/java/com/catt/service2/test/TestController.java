package com.catt.service2.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Huang Zhi Jie
 * @time: 2020/5/22 18:15
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Value("${server.port}")
    String port;

    @GetMapping(value = "/getTestPort")
    public String getTestPort() {
        return "当前的端口号是：" + port;
    }

    @GetMapping(value = "/getTestPort1")
    public String getTestPort(@RequestParam(value = "id", required = false) String id) {
        return "当前的端口号是：" + id;
    }
}
