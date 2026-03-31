package PageClasses;

import org.openqa.selenium.By;

import Utilities.BaseClass;

public class LogOutPage extends BaseClass {

	public static By hamburgerMenu() {
		return By.xpath("//*[@id = 'menu-toggle']");
	}
	
	public static By logoutButton() {
		return By.xpath("//a[text()= 'Logout']");
	}
	
	public static By homeIcon() {
		return By.xpath("//*[text() = 'Home']");
		
	}
	
	public static By loginIcon() {
		return By.xpath("//*[text() = 'Login']");
		
	}
}
