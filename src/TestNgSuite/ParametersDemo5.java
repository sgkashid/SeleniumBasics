package TestNgSuite;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo5 {

	@Test
	@Parameters("browser")
	public void openBrowser(String browser)
	
	{
		if(browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santu\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.close();
	}
	
	else if(browser.equalsIgnoreCase("firefox"))
	{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Santu\\Desktop\\SGK_Selenium\\Installation_JAR Files\\Firefox Setup Stub 54.0.1.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.close();
	}
		
		else
	{
			System.out.println("Wrong Input");
	}
		
	}
	
	
}
