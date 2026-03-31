package PageClasses;

import org.openqa.selenium.By;

import Utilities.BaseClass;

public class BookedAppointmentHistoryPage extends BaseClass {
	
	public static By hamburgerMenu() {
		return By.xpath("//*[@id = 'menu-toggle']");
	}
	
	public static By historyIcon() {
		return By.xpath("(//*[text()= 'History'])[1]");
	}
	
	public static By panelCounts() {
		return By.xpath("//div[@class= 'panel-heading']");
	}
	
	
	
	
	
	
	
	
	
	

}
