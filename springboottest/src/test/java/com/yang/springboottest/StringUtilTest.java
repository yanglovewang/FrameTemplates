package com.yang.springboottest;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

@RunWith(SpringRunner.class)
public class StringUtilTest {

    @Test
    public void test() {
        boolean empty = StringUtils.isEmpty("");
        System.out.println(empty);
    }
}
