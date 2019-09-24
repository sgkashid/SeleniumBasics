package ListBoxElements;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {

	public static void main(String[] args) throws IOException {
	
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Santu\\Desktop\\chromedriver.exe");	 
		WebDriver driver=new ChromeDriver();

		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		 
		
		 
	}
	
}
