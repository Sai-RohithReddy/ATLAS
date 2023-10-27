package org.example;

import org.testng.annotations.Test;

public class GropingExample {

    @Test(groups = {"regression"})
    public void test1() {
        System.out.println("Test 1");
    }

    @Test(groups = {"functional"})
    public void test2() {
        System.out.println("Test 2");
    }

    @Test(groups = {"sanity"})
    public void test3() {
        System.out.println("Test 3");
    }

    @Test(groups = {"regression, sanity"})
    public void test4() {
        System.out.println("Test 4");
    }

    @Test(groups = {"sanity"})
    public void test5() {
        System.out.println("Test 5");
    }

}
