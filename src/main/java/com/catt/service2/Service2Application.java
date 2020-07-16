package com.catt.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/***
 * @Author: Huang Zhi Jie
 * @Description: http://localhost:8002/test/getTestPort1?id=55
 * @Date: 2020/7/14  19:41
 * @Param null:
 * @return: null
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class Service2Application {

    public static void main(String[] args) {
        SpringApplication.run(Service2Application.class, args);
    }

}
