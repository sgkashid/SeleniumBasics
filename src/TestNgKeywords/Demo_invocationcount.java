package TestNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_invocationcount {

	/* 
	 * invocationCount keyword is used to execute same test multiple time
	 */
	
	@Test
	public void TC2() {
		Reporter.log("Running TC2 method", true);
	}
	
	
	@Test(invocationCount=5)
	public void TC1() {
		Reporter.log("Running TC1 method", true);
	}
	
	
}
