package TestNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_priority2 {
	/*
	 * Execution flow of tests in case of multiple tests in TestNG framework with use of priority keyword
	 * Test methods will get executed one after another as per priority mentioned in test annotation 
	 * 1. priority index may be positive/negative/zero
	 * 2. default priority index will be zero always
	 * 3. test with lower priority index will get executed first
	 * 4. test with higher priority index will get executed at the last
	 * Foe eg. sequence of tests with priority index--.>> -19, -3, 0, 3, 9 and so on
	 * Execution flow: 1. test 2. aTest
	 */
	@Test(priority = 1)
	public void test() {
		Reporter.log("Running test method", true);
	}

	@Test(priority = 2)
	public void aTest() {
		Reporter.log("Running aTest method", true);
	}

}
