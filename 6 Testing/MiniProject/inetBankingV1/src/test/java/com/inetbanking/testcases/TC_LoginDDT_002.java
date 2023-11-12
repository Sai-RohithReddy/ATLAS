package com.inetbanking.testcases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageobject.LoginPage;
import com.inetbanking.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass{

	@Test(dataProvider = "LoginData")
	public void loginDDT(String user, String pwd) throws InterruptedException, IOException {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(user);
		logger.info("User name provided");
		lp.setPassword(pwd);
		logger.info("password provided");
		lp.clickSubmit();
		Thread.sleep(3000);
		
		if (isAllertPresent()) {
			captureScreen(driver, "loginDDT");
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			logger.info("Login failed");
			Assert.assertTrue(false);
//			logger.warn("Login failed");
		} else {
			Assert.assertTrue(true);
			logger.info("Login passed");
			lp.clickLogout();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}

	}
	
	public boolean isAllertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	@DataProvider(name = "LoginData")
	String[][] getData() throws IOException {
		
		String path = ".\\src\\test\\java\\com\\inetbanking\\testdata\\LoginData.xlsx";
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colnum = XLUtils.getCellCount(path, "Sheet1", rownum);
		
		String[][] logindata = new String[rownum][colnum];
		
		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < colnum; j++) {
				logindata[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return logindata;
	}
}
