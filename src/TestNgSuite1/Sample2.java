package TestNgSuite1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 {

	@Test
	public void test3()
	{
		Reporter.log("Running Test 3 from Sample 2 Package", true);
//		Assert.fail();
	}
	
	
	@Test
	public void test4()
	{
		Reporter.log("Running Test 4 from Sample 2 package", true);
	}
	
}
