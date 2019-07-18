package com.yang.springboottest.cookie;


import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("cookie")
public class Cookie {

    @RequestMapping("")
    public void cookie(HttpServletRequest request) {
        javax.servlet.http.Cookie[] cookies = request.getCookies();
        for (javax.servlet.http.Cookie cookie: cookies) {
            //通过domain实现跨域访问
            cookie.setDomain("");
        }
    }
}
