package com.edu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Login {
	public boolean login(String email, String password) {
		
		boolean flag = false;
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		flag = !driver.getPageSource().contains("Login was unsuccessful. Please correct the errors and try again.");
		
		driver.close();
		
		return flag;
	}
	public static void main(String[] args) {
		Login l = new Login();
		l.login("rohithreddy8919@gmail.com", "abc123");
	}
}
