package com.yang.learnjava8.test;

import Bean.Apple;

public class AppleFormatWight implements AppleFormat {

    @Override
    public String test(Apple apple) {
        double weight = apple.getWeight();
        return String.valueOf(weight);
    }
}
