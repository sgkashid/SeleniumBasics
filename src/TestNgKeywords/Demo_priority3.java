package TestNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_priority3 {
/* Execution flow
 * priority=-2 -> priority 0 -> priority 5 -> priority 20[alphabetically] i.e TC4 -> TC5
 * TC2 -> TC3 -> TC1 -> TC4 -> TC5
 */
	@Test(priority=5)
	public void TC1()
	{
		Reporter.log("TC 1", true);
	}
	
	
	@Test(priority=-2)
	public void TC2()
	{
		Reporter.log("TC 2", true);
	}
	
	@Test(priority=0)
	public void TC3()
	{
		Reporter.log("TC 3", true);
	}
	@Test(priority=20)
	public void TC4()
	{
		Reporter.log("TC 4", true);
	}
	
	@Test(priority=20)
	public void TC5()
	{
		Reporter.log("TC 5", true);
	}
	
	
}
