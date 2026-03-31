package PageClasses;

import org.openqa.selenium.By;

import Utilities.BaseClass;

public class MakeAppointmentPage extends BaseClass {

	public static By clickMakeAppointmentButton() {
		return By.xpath("(//*[text() = 'Make Appointment'])[1]");
	}
	
	public static By facility() {
		return By.xpath("//*[@id = 'combo_facility']");
	}	
	
	public static By visitDate() {
		return By.xpath("//*[@id = 'txt_visit_date']");
	}
	
	public static By formGroup() {
		//return By.xpath("(//*[@class= 'form-group'])[2]");
		// click date field
		driver.findElement(MakeAppointmentPage.visitDate()).click();

		// select a day (example: 15)
		return By.xpath("//td[text()='15']");
	}
	
	
	public static By commentField() {
		return By.xpath("//*[@id = 'txt_comment']");
	}
	
	public static By clickBookAppointmentButton() {
		return By.xpath("//*[@id = 'btn-book-appointment']");
	}

	public static By validateBooking() {
		return By.xpath("//*[text()= 'Appointment Confirmation']");
	}
	
	public static By confirmBookingText() {
		return By.xpath("//*[text()= 'Please be informed that your appointment has been booked as following:']");
	}
	
}
