package com.yang.springboottest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试拦截器controller
 */
@RestController
@RequestMapping("/interceptor")
public class InterceptorController {

    private Logger log = LoggerFactory.getLogger(InterceptorController.class);

    @RequestMapping("/myInterceptor")
    public void myInterceptor() {
        log.info("InterceptorController...........");
    }
}
