package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


//***************************************************
//********Reading multiple cells from excel with UNEQUAL width of data in rows**********
//***************************************************
public class Demo3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Santu\\Desktop\\SGK_Selenium\\excelDemo3.xlsx");
		Sheet sheetname = WorkbookFactory.create(file).getSheet("Sheet1");
		int rowcount = sheetname.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			short cellcount = sheetname.getRow(i).getLastCellNum();
			for (int j = 0; j < cellcount; j++) {
				String value = sheetname.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"  ");
				
			}
			System.out.println();
		}
		
	}
	
	
	
	
}
