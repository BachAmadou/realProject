package TestClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageClasses.MakeAppointmentPage;
import Utilities.BaseClass;

public class MakeAppointmentTest extends BaseClass{
	
	// We use dataProvider, when we want to make the same test with different data.
	@DataProvider(name="bookAppointment")
	public Object [][] method() {
		
		return new Object [][] {
		{"06/04/2026", "This booking is for dentist"},
		{"10/04/2026", "This booking is for Physician"}
			};
	}
	
	@Test(dataProvider="bookAppointment")
	public void createAppointment(String date, String comment) throws InterruptedException {
		
		LoginTest.executeLogin();
		//driver.findElement(MakeAppointmentPage.clickMakeAppointmentButton()).click();
		scrollDown();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(MakeAppointmentPage.facility());
		Select facilitySelect = new Select(ele);
		facilitySelect.selectByIndex(0);;
		driver.findElement(MakeAppointmentPage.visitDate()).sendKeys(date);
		driver.findElement(MakeAppointmentPage.formGroup()).click();
		driver.findElement(MakeAppointmentPage.commentField()).sendKeys(comment);
		driver.findElement(MakeAppointmentPage.clickBookAppointmentButton()).click();
		Thread.sleep(3000);
		scrollDown();
		boolean flag1 = driver.findElement(MakeAppointmentPage.validateBooking()).isDisplayed();
		boolean flag2 = driver.findElement(MakeAppointmentPage.confirmBookingText()).isDisplayed();
		
		if(flag1 && flag2 == true) {
			
			System.out.println("Appointmet created and confirmed");
		}
	}	
}
