package com.edu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class PlaceAnOrder {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("rohithreddy8919@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abc123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

		driver.findElement(By.partialLinkText("Books")).click();
		driver.findElement(By.partialLinkText("Fiction")).click();
		driver.findElement(By.id("addtocart_45_EnteredQuantity")).clear();
		driver.findElement(By.id("addtocart_45_EnteredQuantity")).sendKeys("5");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-45']")).click();

		driver.findElement(By.partialLinkText("Electronics")).click();
		driver.findElement(By.partialLinkText("Cell phones")).click();
		driver.findElement(By.xpath("//div[@class='add-info']/div[2]")).click();

		driver.findElement(By.partialLinkText("Shopping cart")).click();

		Select country = new Select(driver.findElement(By.id("CountryId")));
		country.selectByValue("44");

		driver.findElement(By.id("ZipPostalCode")).sendKeys("500033");
		driver.findElement(By.name("estimateshipping")).click();

		driver.findElement(By.cssSelector("input#termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
//		
//		Select billingAddrCountry = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
//		billingAddrCountry.selectByValue("41");
//		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Hyderabad");
//		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("11-11-11/202");
//		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("00000");
//		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("9999999999");
//		driver.findElement(By.cssSelector("input.button-1.new-address-next-step-button")).click();

		driver.findElement(By.xpath("//div[@id='billing-buttons-container']/input")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//div[@id='shipping-buttons-container']/input")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//div[@id='shipping-method-buttons-container']/input")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//div[@id='payment-method-buttons-container']/input")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//div[@id='payment-info-buttons-container']/input")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//div[@id='confirm-order-buttons-container']/input")).click();

		driver.findElement(By.cssSelector("input.button-2.order-completed-continue-button")).click();

		driver.findElement(By.cssSelector("a.account")).click();
		driver.findElement(By.partialLinkText("Orders")).click();
		driver.findElement(By.xpath("//input[@value='Details']")).click();
	}

}
