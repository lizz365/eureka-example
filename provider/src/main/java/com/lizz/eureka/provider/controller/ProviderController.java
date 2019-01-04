package com.lizz.eureka.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AppController
 *
 * @author zhenzhong.li
 * @date 19/1/2
 */
@RestController
@RequestMapping(value = "/test/", produces = "application/json; charset=utf-8")
public class ProviderController {
    private static final Logger logger = LoggerFactory.getLogger(ProviderController.class);

    @GetMapping("hi/{name}")
    public String hi(@PathVariable String name) {
        logger.info("******************hi {}", name);
        return "hi " + name;
    }

}
