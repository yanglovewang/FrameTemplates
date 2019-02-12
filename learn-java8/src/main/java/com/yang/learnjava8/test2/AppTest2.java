package com.yang.learnjava8.test2;

import Bean.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class AppTest2 {

    public static void main(String[] args) {
        // Filtering with lambdas
        List<Apple> inventory = Arrays.asList(new Apple(80,23, "z"), new Apple(155, 34, "w"), new Apple(120, 56.6, "z"));
        Comparator<Apple> c = comparing(Apple::getName);
        inventory.sort(c);
    }

    //v1
    public  void test1() {
        List<Apple> inventory = Arrays.asList(new Apple(80,23, "z"), new Apple(155, 34, "w"), new Apple(120, 56.6, "z"));
        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    //v2
    public  void test2() {
        List<Apple> inventory = Arrays.asList(new Apple(80,23, "z"), new Apple(155, 34, "w"), new Apple(120, 56.6, "z"));
        Comparator<Apple> c = (a1, a2) -> {
            return a1.getName().compareTo(a2.getName());
        };
        inventory.sort(c);
    }

    //v3
    public  void test3() {
        List<Apple> inventory = Arrays.asList(new Apple(80,23, "z"), new Apple(155, 34, "w"), new Apple(120, 56.6, "z"));
        inventory.sort((a1, a2) -> {
            return a1.getName().compareTo(a2.getName());
        });
    }

    //v4
    public  void test4() {
        List<Apple> inventory = Arrays.asList(new Apple(80,23, "z"), new Apple(155, 34, "w"), new Apple(120, 56.6, "z"));
        Comparator<Apple> c = comparing(Apple::getName);
        inventory.sort(c);
    }

    //v5
    public  void test5() {
        List<Apple> inventory = Arrays.asList(new Apple(80,23, "z"), new Apple(155, 34, "w"), new Apple(120, 56.6, "z"));
        inventory.sort(comparing(Apple::getName));
    }
}
