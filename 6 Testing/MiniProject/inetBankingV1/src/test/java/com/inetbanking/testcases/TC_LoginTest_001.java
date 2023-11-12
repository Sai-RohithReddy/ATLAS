package com.inetbanking.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException {

		LoginPage lp = new LoginPage(driver);

		logger.info("URL is opened");

		lp.setUserName(userName);
		logger.info("Entered username");
		lp.setPassword(password);
		logger.info("Entered password");

		lp.clickSubmit();

		if (driver.getTitle().equals("Guru99 Bank Manager HomePages")) {
			Assert.assertTrue(true);
			logger.info("Login test passed");
		} else {
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		logger.info("==========================");
	}
}
