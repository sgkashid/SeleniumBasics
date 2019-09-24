package AutoSuggestDropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santu\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("redmi");
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		 int size=options.size();
		 System.out.println(size);
		 System.out.println("Options from Autosuggestive DropDown are as below:");
		 for (int i = 0; i < size; i++) {
			String str=options.get(i).getText();
			System.out.println(str);
		}
		
		String exp="redmi note 7 pro";
		for (int i = 0; i < size; i++) {
			String act=options.get(i).getText();
			boolean result=act.equals(exp);
			
			if(result){
				options.get(i).click();
				break;
			}
		}
		
		driver.close();
	}

}
