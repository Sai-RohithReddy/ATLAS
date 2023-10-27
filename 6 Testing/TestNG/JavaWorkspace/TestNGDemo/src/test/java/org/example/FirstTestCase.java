package org.example;

import org.testng.annotations.Test;

public class FirstTestCase {
    @Test(priority = 1)
    public void setup() {
        System.out.println("Opening browser");
    }

    @Test(priority = 2, enabled = false)
    public void login() {
        System.out.println("This is login test");
    }

    @Test(priority = 3)
    public void teardown() {
        System.out.println("Closing browser");
    }
}
