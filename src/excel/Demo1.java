package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Santu\\Desktop\\SGK_Selenium\\excelDemo1.xlsx");
		Sheet sheetname = WorkbookFactory.create(file).getSheet("Sheet1");
		Row row = sheetname.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println("The row 0 & cell 0 data is: " +cell.getStringCellValue());
		Cell cell1 = row.getCell(1);
		System.out.println("The row 0 & cell 1 data is: "+cell1.getStringCellValue());
		
		
		
		
	}
	
	
}
