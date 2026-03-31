package Utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	// "RetryAnalyzer" is a class that is implementing "IRetryAnalyzer" interface
	// therefore RetryAnalyzer can use all IRetryAnalyzer methods 
	
	private int count = 0;
	private static final int maxTry = 3;
	
	public boolean retry(ITestResult result) {
		
		if (!result.isSuccess()) {
			
			if(count < maxTry) {
				
				count++;
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
