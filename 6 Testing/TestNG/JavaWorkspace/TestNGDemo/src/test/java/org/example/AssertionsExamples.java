package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionsExamples {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(priority = 1)
    public void logoTest() {
       WebElement logo = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]"));
        Assert.assertTrue(logo.isDisplayed(), "Logo not displayed on the page");
    }

    @Test(priority = 2)
    public void homePageTitle() {
        String title = driver.getTitle();
        Assert.assertEquals("OrangeHRM", title, "Title is not matched");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
