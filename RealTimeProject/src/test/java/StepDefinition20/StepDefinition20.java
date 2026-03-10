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
	
	WebDriver driver = BaseClass.initializeDriver();
	LoginPage loginpage = new LoginPage(driver);
	CreateCustomerPage createnewcustomer = new CreateCustomerPage(driver);
	

	

	@Given("user opens the login page of the application")
	public void user_opens_the_homepage_of_the_application() {
	    
		String loginTitle = getTitle();
		
		if(loginTitle.contains("Guru99 Bank")) {
			
			System.out.println("User is on the login page");
		}
		else {
			throw new NullPointerException("Incorrect Page Opened");
		}
	}
	
	@Given("user enters the username as {string}")
	public void user_enters_the_username_as(String username) {
		
	   loginpage.enterUserName(username);
	}
	
	@Given("user enters the password as {string}")
	public void user_enters_the_password_as(String password) {
		
	    loginpage.enterPassword(password);
	}
	
	@When("user clicks on the login button")
	public void user_clicks_on_the_login_buttion() {
		
	   loginpage.clickLogin();
	}
	
	@Then("validate user will be navigated to the homepage")
	public void validate_user_will_be_navigated_to_the_homepage() {
		
		String homePageTitle = getTitle();
		System.out.println(homePageTitle);
		
		if(homePageTitle.contains("HomePage")) {
			
			System.out.println("User is on the home page");
		}
		else {
			throw new NullPointerException("Incorrect Page Opened");
		}
	  
	}
	


	@Then("user clicks on the new Customer link")
	public void user_clicks_on_the_new_customer_link() {
		createnewcustomer.clickOnNewCustomer();
	}

	@Then("user enters the customername as {string}")
	public void user_enters_the_customername_as(String customerName) {
		createnewcustomer.enterUserName(customerName);
	}

	@Then("user selects the gender")
	public void user_selects_the_gender() {
		createnewcustomer.selectGender();
	}

	@Then("user enters the DOB as {string}")
	public void user_enters_the_dob_as(String dOB) {
		createnewcustomer.enterDOB(dOB);
	}

	@Then("user enters the address as {string}")
	public void user_enters_the_address_as(String address) {
		createnewcustomer.enterAddress(address);
	}

	@Then("user enters the city as {string}")
	public void user_enters_the_city_as(String city) {
		createnewcustomer.enterCity(city);
	}

	@Then("user enters the state as {string}")
	public void user_enters_the_state_as(String state) {
		createnewcustomer.enterState(state);
	}

	@Then("user enters the pin as {string}")
	public void user_enters_the_pin_as(String pin) {
		createnewcustomer.enterPin(pin);
	}

	@Then("user enters the mobileNumber as {string}")
	public void user_enters_the_mobile_number_as(String mobileNumber) {
		createnewcustomer.enterPhone(mobileNumber);
	}

	@Then("user enters the email")
	public void user_enters_the_email() {
		createnewcustomer.enterEmail();
	}
	
	@Then("user enters password as {string}")
	public void user_enters_password_as(String password) {
		createnewcustomer.enterPassword(password);
	}

	@When("user clicks on the submit button")
	public void user_clicks_on_the_submit_button() {
		createnewcustomer.clickSubmit();
	}

	@Then("new customer is created")
	public void new_customer_is_created() {
		createnewcustomer.validateCustIDGeneration();
	}

	@Then("user captures the customer id")
	public void user_captures_the_customer_id() {
		 String customerID = createnewcustomer.getCustomerID();
		 System.out.println("Customer ID generated is " + customerID);
	}
		
	
	@Then("user closes the browser")
	public void user_closes_the_browser() {

		closeBrowswer();
	}


	

}
