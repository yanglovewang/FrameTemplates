package com.yang.springboottest.enums;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoginFailTypeEnumTest {

    @Test
    public void logFail() {
        String code = LoginFailTypeEnum.BLACKLIST.getCode();
        LoginFailTypeEnum login = LoginFailTypeEnum.UN_LOGIN;
    }

}