package StepDefinition20;

import org.openqa.selenium.WebDriver;

import PageFactory20.CreateCustomerPage;
import PageFactory20.CreateNewAccountPage;
import PageFactory20.FundsTransferPage;
import PageFactory20.LoginPage;
import PageFactory20.LogoutPage;
import Utilities.BaseClass;
import Utilities.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition20 extends BaseClass {
	
	WebDriver driver = BaseClass.initializeDriver();
	LoginPage loginpage = new LoginPage(driver);
	CreateCustomerPage createnewcustomer = new CreateCustomerPage(driver);
	CreateNewAccountPage newaccount = new CreateNewAccountPage(driver);
	FundsTransferPage transferfund = new FundsTransferPage(driver);
	LogoutPage logoutpage = new LogoutPage(driver);

	
   // Login cucumber shells 
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
	
	@Given("user enters password as {string}")
	public void user_enters_password_as(String password) {
		loginpage.enterPassword(password);
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
	


	// Create new Customer cucumber shells 
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
	
	@Then("user enters the password as1 {string}")
	public void user_enters_the_password_as1(String password) {
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
	
	
	
	// Create new Account cucumber shells 
@Then("user clicks on new account link")
public void user_clicks_on_new_account_link() {
	newaccount.clickOnNewAccountLink();
}

@Then("user enters customer id")
public void user_enters_customer_id(String cID) {
	newaccount.enterCustomerID(cID);
}

@Then("user selects the account type")
public void user_selects_the_account_type(String savings) {
	newaccount.selectAccountType(savings);
}

@Then("user enters the initial deposit amount")
public void user_enters_the_initial_deposit_amount(String amount) {
	newaccount.enterInitialDeposit(amount);
}

@Then("validate user can see the new account information is displayed")
public void validate_user_can_see_the_new_account_information_is_displayed() {
    
	String newAccountPageTitle = getTitle();
	System.out.println(newAccountPageTitle);
	
	if(newAccountPageTitle.contains("Created Account details")) {
		
		System.out.println("A new account is created");
	}
	else {
		throw new NullPointerException("No account created");
	}
}

	
	
// Make funds transfer cucumber shells 
@Then("user clicks Fund Transfer link")
public void user_clicks_fund_transfer_link() {
	transferfund.clickOnTransferButton();
}

@Then("user enters Payers account no")
public void user_enters_payers_account_no(String payerid) {
	transferfund.enterPayerID(payerid);
}

@Then("user enters Payees account no")
public void user_enters_payees_account_no(String payeeid) {
	transferfund.enterPayeeID(payeeid);
}

@Then("user enters amount")
public void user_enters_amount(String amount) {
	transferfund.enterTransferAmount(amount);
}

@Then("user enters description")
public void user_enters_description(String desc) {
	transferfund.enterTrasferDescription(desc);
}

@Then("validate user can see fund transfer details is displayed")
public void validate_user_can_see_fund_transfer_details_is_displayed() {
	String fundTransferPageTitle = getTitle();
	System.out.println(fundTransferPageTitle);
	
	if(fundTransferPageTitle.contains("Fund Transfer details")) {
		
		System.out.println("Funds have been transferred");
	}
	else {
		throw new NullPointerException("No Transfer done");
	}
}
	
	
// Logout cucumber shells
@Then("user can logout")
public void user_can_logout() {
	logoutpage.clickOnLogoutButton();
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	@Then("user closes the browser")
	public void user_closes_the_browser() {

		closeBrowswer();
	}


	

}
