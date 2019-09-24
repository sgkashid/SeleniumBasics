package TestNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_priority1 {
	//Tests with same priority(default priority is zero)
	//Execution flow of tests in case of multiple tests in TestNG framework without use of priority keyword
	//******Test methods will get executed one after another as per alphabetic order irrespective of its position in class***
	//Execution flow: 1. aTest   2. test
	
	@Test
	public void test()
	{
		Reporter.log("Running test method", true);
	}
	
	@Test
	public void aTest()
	{
		Reporter.log("Running aTest method", true);
	}
}
