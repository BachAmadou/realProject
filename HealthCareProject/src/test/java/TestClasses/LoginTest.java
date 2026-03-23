package TestClasses;

import org.testng.annotations.Test;

import PageClasses.LoginPage;
import Utilities.BaseClass;

public class LoginTest extends BaseClass{

	@Test(priority=0)
	public static void executeLogin() {
		driver.findElement(LoginPage.hamburgerMenu()).click();
		driver.findElement(LoginPage.clickLogin()).click();
		driver.findElement(LoginPage.enterUserName()).sendKeys("John Doe");
		driver.findElement(LoginPage.enterPassword()).sendKeys("ThisIsNotAPassword");
		driver.findElement(LoginPage.clickLoginButton()).click();
		
	}
}
