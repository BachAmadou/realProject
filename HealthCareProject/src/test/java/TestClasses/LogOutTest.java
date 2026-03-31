package TestClasses;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageClasses.LogOutPage;
import Utilities.BaseClass;
import Utilities.ListenerImplementation;

@Listeners(ListenerImplementation.class)

public class LogOutTest extends BaseClass {

	@Test(retryAnalyzer=Utilities.RetryAnalyzer.class, groups = "sanity")
	public static void logOut() {
		
		LoginTest.executeLogin();
		driver.findElement(LogOutPage.hamburgerMenu()).click();
		driver.findElement(LogOutPage.logoutButton()).click();
		driver.findElement(LogOutPage.hamburgerMenu()).click();
		boolean flag1 = driver.findElement(LogOutPage.homeIcon()).isDisplayed();
		boolean flag2 = driver.findElement(LogOutPage.loginIcon()).isDisplayed();
		
		if(flag1 == true && flag2 == true) {
			System.out.println("Logged out successfully");
		} else {
			throw new NoSuchElementException("Icons are not present");
		}
	}
}
