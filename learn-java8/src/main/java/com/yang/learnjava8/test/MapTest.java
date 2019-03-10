package com.yang.learnjava8.test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class MapTest {

    public static void main(String[] args) {

        testOptional();

    }

    public static void testMap() {
        List<String> list = Arrays.asList("jaaaa", "csdcds", "ddsvdv", "fsfsd");
        List<String> list2 = Arrays.asList("jaaaa", "csdcds", "ddsvdv", "fsfsd");
        List<String[]> collect = list.stream().map((item) -> {
            return item.split("");
        }).collect(toList());

        List<String> collect1 = list2.stream().map((item) -> {
            return item.split("");
        }).flatMap((item) -> {
            return Arrays.stream(item);
        }).collect(toList());

        System.out.println("c1 = " + collect);
        System.out.println("c2 = " + collect1);
    }

    public static void testOptional() {
        List<String> list = Arrays.asList("cascsa");
        Optional optional = list.stream().findAny();
        System.out.println(optional);

    }

    public static void reduse() {
       List<Integer> numbers = new ArrayList<Integer>();
    }



}
