package PageFactory20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
//	@FindBys(
//			{
//			@FindBy(id="x"),
//			@FindBy(name="y")
//			
//			}
//			
//			)
//	
//	@FindAll(
//			{
//			@FindBy(id="x"),
//			@FindBy(name="y")
//			
//			}
//			
//			)
	
	
	
	
	
	@FindBy(xpath="//input[@name='uid']")
	WebElement UserId;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement Login_btn;
	
	@FindBy(xpath="//input[@name='btnReset']")
	WebElement Reset_btn;
	
	
	
	
	
	
	
	
	public void enterUserName(String userName)
	{
		UserId.sendKeys(userName);
	}
	
	public void enterPassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void clickLogin()
	{
		Login_btn.click();
	}
	
	public void clickReset()
	{
		Reset_btn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
