package TestNgSuite1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {

	@Test
	public void test1()
	{
		Reporter.log("Running Test 1 from Sample 1 Package", true);
//		Assert.fail();
	}
	
	
	@Test
	public void test2()
	{
		Reporter.log("Running Test 2 from Sample 1 package", true);
	}
	
}
