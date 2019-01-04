package com.lizz.eureka.consumer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ConsumerController
 *
 * @author zhenzhong.li
 * @date 19/1/3
 */
@RestController
@RequestMapping(value = "/test/", produces = "application/json; charset=utf-8")
public class ConsumerController {
    private static final Logger logger = LoggerFactory.getLogger(ConsumerController.class);
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("getHi/{name}")
    public String getHi(@PathVariable String name) {
        String msg=restTemplate.getForEntity("http://eureka-provider/eureka-provider/test/hi/{name}",String.class,name).getBody();

        return msg;
    }
}
