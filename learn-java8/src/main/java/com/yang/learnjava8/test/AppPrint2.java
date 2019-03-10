package com.yang.learnjava8.test;

import Bean.Apple;

import java.util.ArrayList;
import java.util.List;

public class AppPrint2 {

    public static void main(String[] args) {



    }

    public static void prettyPrintApple(List<Apple> inventory, AppleFormat format){
        inventory.forEach(apple -> {
            String output = format.test(apple);
            System.out.println(output);
        });
    }
}
