package Utilities;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeMethod(alwaysRun=true)
	public void launchBrowser() throws IOException {
		
		String URL = FetchDataFromProperty.getDataFromProperty().getProperty("url");
		String browserName = FetchDataFromProperty.getDataFromProperty().getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.get("URL");
			driver.manage().window().maximize();
		}
		
		if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.get(URL);
			driver.manage().window().maximize();
		}
		
		if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
		}
	}

	
	@AfterMethod
	public void browserClose() {
		driver.quit();
	}
	
	// Scroll down to see the confirmation text after booking an appointment
	public static void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)", "");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
