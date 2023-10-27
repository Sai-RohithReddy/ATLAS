package org.example;

import org.testng.annotations.*;

public class TC1 {

    @BeforeSuite
    public void beforeSuit() {
        System.out.println("Before Suit");
    }

    @AfterSuite
    public  void afterSuit() {
        System.out.println("After Suit");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @AfterTest
    public  void afterTest() {
        System.out.println("After Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class..");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method..");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method..");
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }
}
