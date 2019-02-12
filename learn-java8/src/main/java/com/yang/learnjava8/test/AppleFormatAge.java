package com.yang.learnjava8.test;

import Bean.Apple;

public class AppleFormatAge implements AppleFormat {

    @Override
    public String test(Apple apple) {
        int age = apple.getAge();
        return String.valueOf(age);
    }
}
