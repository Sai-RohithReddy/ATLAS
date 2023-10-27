package com.edu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Register {

	public void newUser() {

		WebDriver driver = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Rohith");
		driver.findElement(By.id("LastName")).sendKeys("Reddy");
		driver.findElement(By.id("Email")).sendKeys("rohithreddy8919@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abc123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("abc123");
		driver.findElement(By.id("register-button")).click();
		
		driver.close();
	}
	public static void main(String[] args) {
		Register r = new Register();
		r.newUser();
	}
}
