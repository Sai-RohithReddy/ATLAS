package paralleltest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelTest1 {

    WebDriver driver;

    @Test
    public void logoTet() throws InterruptedException {
        driver = new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
        Assert.assertTrue(logo.isDisplayed());
        driver.quit();
    }

    @Test
    public void homePageTitle() {
        driver = new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String title = driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM");
        driver.quit();
    }
}
