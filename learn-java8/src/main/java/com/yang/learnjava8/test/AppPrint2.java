package com.yang.learnjava8.test;

import Bean.Apple;

import java.util.ArrayList;
import java.util.List;

public class AppPrint2 {

    public static void main(String[] args) {

        List<Apple> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Apple a = new Apple(i, i+2.5);
            list.add(a);
        }

        AppPrint2.prettyPrintApple(list, (Apple apple) -> {
            return String.valueOf(apple.getAge());

        });

    }

    public static void prettyPrintApple(List<Apple> inventory, AppleFormat format){
        inventory.forEach(apple -> {
            String output = format.test(apple);
            System.out.println(output);
        });
    }
}
