package org.example;

import org.testng.annotations.*;

public class TC2 {

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
    public void test3() {
        System.out.println("Test 3");
    }

    @Test
    public void test4() {
        System.out.println("Test 4");
    }
}
