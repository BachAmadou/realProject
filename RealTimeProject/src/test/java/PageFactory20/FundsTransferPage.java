package PageFactory20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundsTransferPage {
	
	WebDriver driver;
	
	// Constructor
	public FundsTransferPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	// Locators
	@FindBy(xpath = "//input[@name = 'payersaccount']")
	WebElement payerId;
	
	@FindBy(xpath = "//input[@name = 'payeeaccount']")
	WebElement payeeId;
	
	@FindBy(xpath = "//input[@name = 'ammount']")
	WebElement sendAmount;
	
	@FindBy(xpath = "//input[@name = 'desc']")
	WebElement amountDesc;
	
	@FindBy(xpath = "//input[@type = 'submit']")
	WebElement sendBtn;
	
	
	
	// Action Methods
	public void enterPayerID(String payerid) {
		payerId.sendKeys(payerid);
	}
	
	public void enterPayeeID(String payeeid) {
		payeeId.sendKeys(payeeid);
	}
	
	public void enterTransferAmount(String amount) {
		sendAmount.sendKeys(amount);
	}
	
	public void enterTrasferDescription(String desc) {
		amountDesc.sendKeys(desc);
	}
	
	public void clickOnTransferButton() {
		sendBtn.click();
	}
	
	public void confirmNewAccount() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
