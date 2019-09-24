package TestNgSuite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {

	
	

	@Test
	public void TC3()
	{
		Reporter.log("Running TC 3", true);
//		Assert.fail();
	}
	
	
	@Test
	public void TC4()
	{
		Reporter.log("Running TC 4", true);
	}
	
}
