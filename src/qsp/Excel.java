package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//get java object of the physical file	
		
		FileInputStream file=new FileInputStream("./data/TestScripData.xlsx");
		
		 Workbook wb = WorkbookFactory.create(file);
		 //get the last user rowcount
		int RowCount = wb.getSheet("createcustomer").getLastRowNum();
		
		for (int i=1;i<=RowCount;i++) {
		 String value = wb.getSheet("createcustomer").getRow(i).getCell(0).toString();
		 System.out.println(value);
		}
}
}