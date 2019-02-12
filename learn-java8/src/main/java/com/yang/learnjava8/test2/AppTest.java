package com.yang.learnjava8.test2;

import Bean.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class AppTest {

    public static void main(String[] args) {
        //boolean
        Predicate<String> predicate = (String s) -> {
            return true;
        };

        Supplier<Apple> supplier = () -> {
            return new Apple(1,3);
        };

        Consumer<Apple> consumer = (Apple a) -> {
        };

        //lambda只能访问闭包函数外的局部变量，不能修改
        int a = 2;
        Runnable runnable = () -> {
          // a - 1;   变异不通过
            System.out.println(a);
        };



    }

    public  void test() {
        List<String> list = new ArrayList<>();
        list.sort((s1, s2) -> {
            s1.compareTo(s2);
            return s1.compareTo(s2);
        });
    }



}
