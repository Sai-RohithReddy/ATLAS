package com.amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Login {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("phone");
		search.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[@id='a-autoid-24']/span/button/div")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("add-to-cart-button")).click();
//		driver.findElement(By.id("nav-cart-count")).click();
	
	}

}
