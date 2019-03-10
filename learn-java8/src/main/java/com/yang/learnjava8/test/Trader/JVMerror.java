package com.yang.learnjava8.test.Trader;

public class JVMerror {

    public static void main(String[] args) {
        Integer a = 444;
        Integer b = 444;
        System.out.println(a.equals(b));
        System.out.println(a == b);
    }
}
