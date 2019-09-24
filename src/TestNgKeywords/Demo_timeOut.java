package TestNgKeywords;

import org.junit.rules.Timeout;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_timeOut {

	/*
	 * timeOut: This keyword is used to fail the particular test method if it will not being executed in given time
	 * Here time is specified in miliseconds
	 * 
	 */
	
	@Test(timeOut=5000)
	public void Test1() throws InterruptedException
	{	Thread.sleep(6000);
		Reporter.log("Running Test 1 method", true);
	}
	
	@Test(timeOut=5000)
	public void Test2() 
	{
		Reporter.log("Running Test 2 method", true);
	}
	
}
