package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RegistrationTest {
	public static void main(String[] args) {
		verifyFlightReg();
	}
	public static void verifyFlightReg() {
		WebDriver driver = new EdgeDriver();
		
		RegistrationPage2 rgp = new RegistrationPage2(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/selenium/newtours/");
		
		rgp.clickRegLink();
		rgp.setFirstName("Rohith");
		rgp.selectCountry("INDIA");
	}
}
