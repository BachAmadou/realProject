package PageClasses;

import org.openqa.selenium.By;

import Utilities.BaseClass;

public class LoginPage extends BaseClass{
	
	public static By hamburgerMenu() {
		return By.xpath("//*[@id = 'menu-toggle']");
	}
	
	public static By clickLogin() {
		return By.xpath("//*[text() = 'Login']");
	}
	
	public static By enterUserName() {
		return By.xpath("//*[@id = 'txt-username']");
	}
	
	public static By enterPassword() {
		return By.xpath("//*[@id = 'txt-password']");	
	}

	public static By clickLoginButton() {
		return By.xpath("//*[@id = 'btn-login']");
	}
}
