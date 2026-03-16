package StepDefinition20;

import org.openqa.selenium.WebDriver;

import PageFactory20.CreateCustomerPage;
import PageFactory20.LoginPage;
import Utilities.BaseClass;
import Utilities.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition20 extends BaseClass {
	
	
	WebDriver driver=BaseClass.initializeDriver();
	LoginPage obj=new LoginPage(driver);
	CreateCustomerPage obj1=new CreateCustomerPage(driver);
	
	
	@Given("user opens the login of the application")
	public void user_opens_the_homepage_of_the_application() {
		
		String loginTitle= getTitle();
		System.out.println(loginTitle);
		if(loginTitle.contains("Guru99 Bank"))
		{
			System.out.println("user is on the login page");
		}
		
		else
		{
			throw new NullPointerException("Incorrect Page Opened");
		}
			
		
		
		
		}

	@Given("user enters the username as {string}")
	public void user_enters_the_username_as(String username) {
		
		obj.enterUserName(username);
		
	   
	}

	@Given("user enters password as {string}")
	public void user_enters_password_as(String password) {
		
		obj.enterPassword(password);
		
	   
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		
		obj.clickLogin();
	    
	}

	@Then("validate user will be navigated to homepage")
	public void validate_user_will_be_navigated_to_homepage() {
		
		String homePageTitle=getTitle();
		System.out.println(homePageTitle);
		
		
		if(homePageTitle.contains("HomePage"))
		{
			System.out.println("user is on the home page");
		}
		
		else
		{
			throw new NullPointerException("Incorrect Page Opened");
		}
			
		
	   
	}
	
	@Then("user clicks on the new Customer link")
	public void user_clicks_on_the_new_customer_link() {
		
		obj1.clickOnNewCustomer();
	    
	}

	@Then("user enters the customername as {string}")
	public void user_enters_the_customername_as(String customerName) {
	   
		
		obj1.enterUserName(customerName);
		
	}

	@Then("user selects the gender")
	public void user_selects_the_gender() {
		
		obj1.selectGender();
	   
	}

	@Then("user enters the DOB as {string}")
	public void user_enters_the_dob_as(String dOB) {
		
		obj1.enterDOB(dOB);
	  
	}

	@Then("user enters the address as {string}")
	public void user_enters_the_address_as(String address) {
		
		obj1.enterAddress(address);
	    
	}

	@Then("user enters the city as {string}")
	public void user_enters_the_city_as(String city) {
		
		obj1.enterCity(city);
	    
	}

	@Then("user enters the state as {string}")
	public void user_enters_the_state_as(String state) {
		
		obj1.enterState(state);
	    
	}

	@Then("user enters the pin as {string}")
	public void user_enters_the_pin_as(String pin) {
		
		obj1.enterPin(pin);
	    
	}

	@Then("user enters the mobileNumber as {string}")
	public void user_enters_the_mobile_number_as(String mobileNumber) {
		
		obj1.enterMobile(mobileNumber);
	   
	}


     @Then("user enters the email")
      public void user_enters_the_email() {
    	 
    	 obj1.enterEmail();
   
        }

	@Then("user enters the password as {string}")
	public void user_enters_the_password_as(String password) {
		
		obj1.enterPassword(password);
	   
	}

	@When("user clicks on the submit button")
	public void user_clicks_on_the_submit_button() {
		
		obj1.clickOnSubmit();
	   
	}

	@Then("new customer is created")
	public void new_customer_is_created() {
	    
		obj1.validateCustIDGeneration();
		
	}

	@Then("user captures the customer id")
	public void user_captures_the_customer_id() {
		
		String customerID=obj1.getCustomerID();
		
		System.out.println("The customer ID generated is   "+customerID);
	   
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	@Then("user closes the browser")
	public void user_closes_the_browser() {
	   
		closeBrowser();
		
	}


}
