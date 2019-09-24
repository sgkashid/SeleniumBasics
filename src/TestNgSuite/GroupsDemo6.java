package TestNgSuite;

import org.testng.annotations.Test;

public class GroupsDemo6 {

	
	@Test(groups={"sanity"})
	public void TC1(){
		System.out.println("TC 1");
	}
	
	@Test(groups={"sanity","regression"})
	public void TC2(){
		System.out.println("TC 2");
	}
	
	@Test(groups={"sanity"})
	public void TC3(){
		System.out.println("TC 3");
	}
	
}
