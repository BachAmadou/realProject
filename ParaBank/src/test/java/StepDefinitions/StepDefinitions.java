package StepDefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	
	public static WebDriver driver;

	@Given("user launches the application")
	public void user_launches_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://parabank.parasoft.com/parabank/admin.htm");
	    driver.manage().window().maximize();
	    
	    System.out.println("App is launched");
	    System.out.println("Passed");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("username")).sendKeys("bank12345");
	    driver.findElement(By.name("password")).sendKeys("bank12345");
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}

	@Then("display the account overview")
	public void display_the_account_overview() {
	    // Write code here that turns the phrase above into concrete actions
	    String accountOverviewPageTitle = driver.getTitle();
	    System.out.println("Page title is " + accountOverviewPageTitle );
	}

	@Then("logout of the application")
	public void logout_of_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();
	}

	@Then("close the application")
	public void close_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	    System.out.println("App is closed");
	}
	
	
	// CREATE NEW ACCOUNT
	
	@When("user clicks on open account option")
	public void user_clicks_on_open_account_option() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a")).click();
	    System.out.println("Page navigated to open new account");
	}

	@When("user clicks on open new account button")
	public void user_clicks_on_open_new_account_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@value='Open New Account']")).click();
	    System.out.println("New account button is clicked");
	} 

	@Then("new account is created")
	public void new_account_is_created() {
	    // Write code here that turns the phrase above into concrete actions
	    String accountDetails = driver.findElement(By.xpath("//p[2]")).getText();
	    System.out.println("New account is created" + accountDetails);
	}
	
	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("username")).sendKeys("username");
	    driver.findElement(By.name("password")).sendKeys("password");
	}

	@Then("validate error message")
	public void validate_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	    String errorMsg = driver.findElement(By.xpath("//p[@class='error']")).getText();
	    System.out.println("Error message is: " + errorMsg);
	}
	
	
	// REGISTRATION 
	@Given("user is navigating to sign up page")
	public void user_is_navigating_to_sign_up_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm");
	}

	@When("user enters sign up details")
	public void user_enters_sign_up_details(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    List<List<String>> obj = dataTable.asLists();
	    // row, column
	    driver.findElement(By.id("customer.firstName")).sendKeys(obj.get(0).get(0));
	    driver.findElement(By.id("customer.lastName")).sendKeys(obj.get(0).get(1));
	    driver.findElement(By.id("customer.address.street")).sendKeys(obj.get(0).get(2));
	    driver.findElement(By.id("customer.address.city")).sendKeys(obj.get(0).get(3));
	    driver.findElement(By.id("customer.address.state")).sendKeys(obj.get(0).get(4));
	    driver.findElement(By.id("customer.address.zipCode")).sendKeys(obj.get(0).get(5));
	    driver.findElement(By.id("customer.phoneNumber")).sendKeys(obj.get(0).get(6));
	    driver.findElement(By.id("customer.ssn")).sendKeys(obj.get(0).get(7));
	    driver.findElement(By.id("customer.username")).sendKeys(obj.get(0).get(8));
	    driver.findElement(By.id("customer.password")).sendKeys(obj.get(0).get(9));
	    driver.findElement(By.id("repeatedPassword")).sendKeys(obj.get(0).get(10));
	}

	@Then("user clicks on register button")
	public void user_clicks_on_register_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@value='Register']")).click();
	}

	@Then("validate successful registration message")
	public void validate_successful_registration_message() {
	    // Write code here that turns the phrase above into concrete actions
		String successMsg = driver.findElement(By.xpath("//p[contains(text(), 'Your account was created successfully. You are now')]")).getText();
		System.out.println("Successful message is: " + successMsg);
	}
	
	
	
	// SECOND SIGN UP WITH DATA DRIVEN

	@When("user enters first name as {string} and last name as {string}")
	public void user_enters_first_name_as_and_last_name_as(String UserName, String Password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("customer.firstName")).sendKeys(UserName);
	    driver.findElement(By.id("customer.lastName")).sendKeys(Password);
	}
	
	@When("user enters address as {string}, city as {string}, state as {string} and zip code as {string}")
	public void user_enters_address_as_city_as_state_as_and_zip_code_as(String Address, String City, String State, String ZipCode) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("customer.address.street")).sendKeys(Address);
	    driver.findElement(By.id("customer.address.city")).sendKeys(City);
	    driver.findElement(By.id("customer.address.state")).sendKeys(State);
	    driver.findElement(By.id("customer.address.zipCode")).sendKeys(ZipCode);
	}
	
	@When("user enters phone number as {string}")
	public void user_enters_phone_number_as(String PhoneNumber) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(PhoneNumber);
	}
	
	@When("user enters SSN as {string}")
	public void user_enters_ssn_as(String SSN) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("customer.ssn")).sendKeys(SSN);
	}
	
	@When("user enters username as {string}, password as {string} and confirm password as {string}")
	public void user_enters_username_as_password_as_and_confirm_password_as(String UserName, String Password, String ConfirmPassword) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("customer.username")).sendKeys(UserName);
	    driver.findElement(By.id("customer.password")).sendKeys(Password);
	    driver.findElement(By.id("repeatedPassword")).sendKeys(ConfirmPassword);
	}
	
	
	// TRANSFER FUNDS
	@Given("user enters username as \\{string}, password as \\{string}")
	public void user_enters_username_as_password_as() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Passed");
	}

	@Given("user navigates to fund transfer page")
	public void user_navigates_to_fund_transfer_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Passed");
	}

	@When("user selects transfer using within bank option")
	public void user_selects_transfer_using_within_bank_option() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Passed");
	}

	@When("user selects from account")
	public void user_selects_from_account() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Passed");
	}

	@When("user selects to account")
	public void user_selects_to_account() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Passed");
	}

	@When("use clicks on transfer button")
	public void use_clicks_on_transfer_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Passed");
	}

	@Then("money transferred successfully")
	public void money_transferred_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Passed");
	}

	// NEFT
	@When("user selects transfer using neft option")
	public void user_selects_transfer_using_neft_option() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Passed");
	}
	
	// RTGS
	@When("user selects transfer using rtgs option")
	public void user_selects_transfer_using_rtgs_option() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Passed");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
