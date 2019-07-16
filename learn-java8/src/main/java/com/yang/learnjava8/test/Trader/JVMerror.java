package com.yang.learnjava8.test.Trader;

import java.util.regex.Pattern;

public class JVMerror {

    public static void main(String[] args) {
        Integer a = 444;
        Integer b = 444;
        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println(validator("32032719960412001x"));
    }

    private static boolean validator(String id) {
        String str = "[1-9]{2}[0-9]{4}(19|20)[0-9]{2}"
                + "((0[1-9]{1})|(1[1-2]{1}))((0[1-9]{1})|([1-2]{1}[0-9]{1}|(3[0-1]{1})))"
                + "[0-9]{3}[0-9x]{1}";
        Pattern pattern = Pattern.compile(str);
        return pattern.matcher(id).matches();
    }
}
