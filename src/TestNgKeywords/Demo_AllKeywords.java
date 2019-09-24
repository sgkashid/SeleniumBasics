package TestNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_AllKeywords {

	@Test                      //2. Passed
	public void TC1()         
	{
		Reporter.log("TC 1", true);
	}
	
	@Test(priority=-3)          //1. Passed
	public void TC2()
	{
		Reporter.log("TC 2", true);
	}
	
	@Test(priority=2,invocationCount=3)       //9. Passed(3)
	public void TC3()
	{
		Reporter.log("TC 3", true);
	}
	
	@Test(timeOut=4000, dependsOnMethods={"TC1"})      //3. Passed
	public void TC4()
	{
		Reporter.log("TC 4", true);
	}
	
	
	@Test(timeOut=4000)                            //4.Failed
	public void TC5() throws InterruptedException
	{	Thread.sleep(5000);
		Reporter.log("TC 5", true);
	}
	
	
	@Test(dependsOnMethods={"TC5","TC4"})           //5. skipped
	public void TC6()
	{
		Reporter.log("TC 6", true);
	}
	
	
	@Test(enabled=false)				//6. skipped
	public void TC7()
	{
		Reporter.log("TC 7", true);
	}
	
	
//	@Test(dependsOnMethods={"TC7"})       //**********7. ERROR************ (Test method should not be dependent on skipped methods)
//	public void TC8()
//	{
//		Reporter.log("TC 8", true);
//	}
	
	
	@Test(dependsOnMethods={"TC6"},invocationCount=2)   //******8.SKIPPED**********
	public void TC9()
	{
		Reporter.log("TC 9", true);
	}
	
		
	
}
