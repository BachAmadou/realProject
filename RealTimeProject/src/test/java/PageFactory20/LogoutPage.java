package PageFactory20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	WebDriver driver;
	
	// Constructor
	public LogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators 
	@FindBy(xpath = "/html/body/div[3]/div/ul/li[15]/a")
	WebElement logOutLink;
	
	
	// Action Methods
	public void clickOnLogoutButton() {
		logOutLink.click();
	}
	
	
	
}
