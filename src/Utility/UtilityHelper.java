package Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityHelper {

	
WebDriver driver;
	
	public UtilityHelper(WebDriver localdriver){
		this.driver=localdriver;
		
	}
	
	public  static void screenshot(WebDriver driver, String TCname) throws IOException {
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Santu\\Desktop\\SGK_Selenium\\sk_"+TCname+".jpg");
		FileHandler.copy(source, destination);
		
	}
	
	
}
