package com.yang.springboottest;

import org.apache.commons.lang3.StringUtils;

public class CommonsTest {

    public static void main(String[] args) {
        boolean blank = StringUtils.isBlank("  ");
        System.out.println(blank);
    }
}
