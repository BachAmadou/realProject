package TestClasses;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageClasses.BookedAppointmentHistoryPage;
import Utilities.BaseClass;
import Utilities.ListenerImplementation;

@Listeners(ListenerImplementation.class)
public class BookedAppointmentHistoryTest extends BaseClass {
	
	@Test(retryAnalyzer=Utilities.RetryAnalyzer.class)
	public void validateAppointments() throws InterruptedException {

		MakeAppointmentTest.createAppointment("06/04/2026", "This booking is for dentist");
		driver.findElement(BookedAppointmentHistoryPage.hamburgerMenu()).click();
		driver.findElement(BookedAppointmentHistoryPage.historyIcon()).click();
		List<WebElement> listAppointment = driver.findElements(BookedAppointmentHistoryPage.panelCounts());
		int x = listAppointment.size();
		Assert.assertEquals(1, x);
		
		System.out.println("Appointment booked and showing in the application");
	}
}
