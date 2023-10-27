package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage2 {
	
	WebDriver driver;
	
	@FindBy(linkText = "REGISTER")
	WebElement RegLink;
	
	@FindBy(how = How.NAME, using = "firstName")
	WebElement FirstName;
	
	@FindBy(name = "country")
	WebElement Country;
	
	RegistrationPage2(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
	}
	
	public void clickRegLink() {
		RegLink.click();
	}
	
	public void setFirstName(String fname) {
		FirstName.sendKeys(fname);
	}
	
	public void selectCountry(String ctry) {
		Select select = new Select(Country);
		select.selectByVisibleText(ctry);
	}
}
