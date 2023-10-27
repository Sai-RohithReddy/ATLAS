package pageObjectModel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	WebDriver driver;
	
	By RegLink = By.linkText("REGISTER");
	By FirstName = By.name("firstName");
	By LastName = By.name("lastName");
	By phone = By.name("phone");
	By email = By.name("userName");
	By address1 = By.name("address1");
	By city = By.name("city");
	By state = By.name("state");
	By postalCode = By.name("postalCode");
	By country = By.name("country");
	By username = By.name("email");
	By password = By.name("password");
	By confirmpassword = By.name("confirmPassword");
	By registerBtn = By.name("submit");
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickRegLink() {
		driver.findElement(RegLink).click();
	}
	
	public void setFirstName(String fname) {
		driver.findElement(FirstName).sendKeys(fname);
	}
	
	public void selectCountry(String ctry) {
		WebElement con = driver.findElement(country);
		Select select = new Select(con);
		select.selectByVisibleText(ctry);
	}
	
}
