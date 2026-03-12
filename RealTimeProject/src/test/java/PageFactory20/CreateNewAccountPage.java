package PageFactory20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccountPage {
	
	WebDriver driver;
	
	// Constructor
	public CreateNewAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// Locator 
	@FindBy(xpath = "/html/body/div[3]/div/ul/li[2]/a")
	WebElement newAccountLink;
	
	@FindBy(xpath = "//input[@name = 'cusid']")
	WebElement newCustId;
	
	@FindBy(xpath = "//input[@value = 'Savings']")
	WebElement accType;
	
	@FindBy(xpath = "//input[@name = 'inideposit']")
	WebElement initialDeposit;
	
	@FindBy(xpath = "//input[@type = 'submit']")
	WebElement submitBtn;
	
	
	
	// Action Methods
	public void clickOnNewAccountLink() {
		newAccountLink.click();
	}
	
	public String enterCustomerID(String cID) {
		newCustId.sendKeys(CreateCustomerPage.getCustomerID());
	}
	
	public void selectAccountType(String savings) {
		accType.sendKeys(savings);
	}
	
	public void enterInitialDeposit(String amount) {
		initialDeposit.sendKeys(amount);
	}
	
	public void clickOnSubmit() {
		submitBtn.click();
	}

}
