package com.yang.springboottest.controller;

import com.yang.springboottest.enums.LoginFailTypeEnum;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class EnumController {

    /**
     * 测试一下返回枚举
     * @return
     */
    @RequestMapping("/enumT")
    public LoginFailTypeEnum enumT(HttpServletResponse res, HttpServletRequest request) {
        request.setAttribute("not", LoginFailTypeEnum.UN_LOGIN);
        return LoginFailTypeEnum.BLACKLIST;
    }
}
