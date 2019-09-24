package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//***************************************************
//********Reading multiple cells from excel with UNEQUAL width of data in rows with NULL data**********
//***************************************************
public class Demo4 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Santu\\Desktop\\SGK_Selenium\\excelDemo4.xlsx");
		Sheet sheetname = WorkbookFactory.create(file).getSheet("Sheet1");
		int rowcount = sheetname.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			String value=null;
			short cellcount = sheetname.getRow(i).getLastCellNum();
			
			for (int j = 0; j < cellcount; j++) {
				
				try {
					value = sheetname.getRow(i).getCell(j).getStringCellValue();
				} catch (Exception e) {
					value=null;
					// TODO Auto-generated catch block		
				}
				System.out.print(value+"  ");
			}
			System.out.println();
		}
		
		
		
	}

}
