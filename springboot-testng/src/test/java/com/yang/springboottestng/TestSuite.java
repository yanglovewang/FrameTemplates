package com.yang.springboottestng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuite {

    @BeforeSuite
    public void testBeforeSuite() {
        System.out.println("BeforeSuite");
    }
    @AfterSuite
    public void testAfterSuite() {
        System.out.println("AfterSuite");
    }

    @Test
    public void testSuite() {
        System.out.println("suiteTest");
    }
}
