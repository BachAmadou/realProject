package Banking;

import StepDefinitions.StepDefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void setUp() {
		System.out.println("Setup executed");
		StepDefinitions obj = new StepDefinitions();
		obj.user_launches_the_application();
		obj.user_enters_username_as_password_as();
		obj.user_navigates_to_fund_transfer_page();
	}
	
	
	@After
	public void tearDown() {
		System.out.println("Tear Down is executed");
		StepDefinitions obj = new StepDefinitions();
		obj.logout_of_the_application();
		obj.close_the_application();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
