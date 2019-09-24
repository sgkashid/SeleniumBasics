package TestNgSuite;

import junit.framework.Assert;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {

	
	@Test
	public void TC1()
	{
		Reporter.log("Running TC 1", true);
//		org.testng.Assert.fail();
	}
	
	
	@Test
	public void TC2()
	{
		Reporter.log("Running TC 2", true);
	}
	
}
