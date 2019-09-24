package TestNgSuite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {

	

	@Test
	public void TC5()
	{
		Reporter.log("Running TC 5", true);
//		Assert.fail();
	}
	
	
	@Test
	public void TC6()
	{
		Reporter.log("Running TC 6", true);
	}
	
	
	
}
