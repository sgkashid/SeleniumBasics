package TestNgKeywords;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_dependsOnMethods {

	/*
	 * dependsOnMethods: This keyword is used if any method is dependent on any other method or methods
	 * eg. 1.dependsOnMethods={"test method name"}
	 * 2.dependsOnMethods={"test method name1","test method name2"}
	 */
	
	@Test
	public void xyz() {
		Reporter.log("Running xyz method", true);
	
	}
	
	
	@Test(dependsOnMethods={"xyz"})
	public void abc() {
		Reporter.log("Running abc method", true);
	}
	
	
	
}
