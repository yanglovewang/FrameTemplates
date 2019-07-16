package com.yang.springboottestng;

import org.testng.annotations.*;

public class BasicAnno {

    @Test
    public void testCase1() {
        System.out.println("testCase1");
    }

    @Test(enabled = false)
    public void testenabled() {
        System.out.println("忽略测试");
    }
    @BeforeMethod
    public void testCase2() {
        System.out.println("BeforeMethod");
    }
    @AfterMethod
    public void testCase3() {
        System.out.println("AfterMethod");
    }

    @BeforeClass
    public void testBeforeClass() {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public void testAfterClass() {
        System.out.println("BeforeClass");

    }

}
