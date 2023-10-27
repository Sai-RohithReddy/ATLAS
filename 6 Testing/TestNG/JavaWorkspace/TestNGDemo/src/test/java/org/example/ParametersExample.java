package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {
    WebDriver driver;

    @BeforeClass
    @Parameters({"browser", "url"})
    public void setup(String browser, String app) {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }

        driver.get(app);
    }

    @Test(priority = 1)
    public void homePageTitle() {
        String title = driver.getTitle();
        Assert.assertEquals("OrangeHRM", title, "Title is not matched");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
