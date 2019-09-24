package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//***************************************************
//********Reading multiple cells from excel with equal width of data in rows**********
//***************************************************
public class demo2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Santu\\Desktop\\SGK_Selenium\\excelDemo2.xlsx");
		Sheet sheetname = WorkbookFactory.create(file).getSheet("Sheet1");
		int rowcount = sheetname.getLastRowNum();
//		System.out.println(rowcount);
		for (int i = 0; i <= rowcount; i++) {
			short cellcount = sheetname.getRow(i).getLastCellNum();
//			System.out.println(cellcount);
			for (int j = 0; j < cellcount; j++) {
				String value = sheetname.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"  ");
			}
			System.out.println();
		}
		
	}
	
	
}
