package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {
    @Test(priority = 1)
    public void test() {
        System.out.println("From SecondTestCase");
        Assert.assertEquals(1, 1);
    }
}
