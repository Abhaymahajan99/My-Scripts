package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelScript3 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//get java object of the physical file	
		
		FileInputStream file=new FileInputStream("./data/ExcelScript3.xlsx");
		
		 Workbook wb = WorkbookFactory.create(file);
		 //write the data to excel by using setcellvalue
		 wb.getSheet("CreateCustomer").getRow(1).getCell(4).setCellValue("fail");
         //get the java file object in write mode
		 FileOutputStream fos= new FileOutputStream("./data/ExcelScript3.xlsx");
		 //save the workbook in writemode
		 wb.write(fos);
		 //close the file once it is save
		 wb.close();
}
}