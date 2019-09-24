package TestNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_enabled {

	/*
	 * enabled=false : this keyword is used to skip execution of particular test method from the class
	 * 
	 */
	@Test
	public void TC2() {
		Reporter.log("Running TC2 method", true);
	}
	
	
	@Test(enabled=false)
	public void TC1() {
		Reporter.log("Running TC1 method", true);
	}
}
