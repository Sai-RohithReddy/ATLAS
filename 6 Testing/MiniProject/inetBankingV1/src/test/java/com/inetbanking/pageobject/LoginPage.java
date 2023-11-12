package com.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver lDriver;

	public LoginPage(WebDriver rDriver) {
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}

	@FindBy(name = "uid")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(name = "password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(name = "btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath = "//a[text()='Log out']")
	@CacheLookup
	WebElement lnkLogOut;

	public void setUserName(String uName) {
		txtUserName.sendKeys(uName);
	}

	public void setPassword(String pswd) {
		txtPassword.sendKeys(pswd);
	}

	public void clickSubmit() {
		btnLogin.click();
	}
	
	public void clickLogout() {
		lnkLogOut.click();
	}

}
