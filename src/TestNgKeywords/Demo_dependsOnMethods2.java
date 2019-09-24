package TestNgKeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_dependsOnMethods2 {

	/*
	 * dependsOnMethods: This keyword is used if any method is dependent on any other method or methods
	 * If prerequisite method fails then execution of dependent method will be skipped
	 * here: 1.pqr method: passed
	 * 2. xyz method: failed
	 * 3. abc method: skipped
	 * 4. mno method: skipped (one prerequisite method is passed and one failed)
	 */
	@Test
	public void pqr() {
		Reporter.log("Running pqr method", true);
		
	}
	
	
	@Test
	public void xyz() {
		Reporter.log("Running xyz method", true);
		Assert.fail();
	}
	
	
	@Test(dependsOnMethods={"xyz"})
	public void abc() {
		Reporter.log("Running abc method", true);
	}


	@Test(dependsOnMethods={"xyz","pqr"})
	public void mno() {
		Reporter.log("Running mno method", true);
	}
	
}
