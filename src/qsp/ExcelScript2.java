package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelScript2 {
	public static void main(String[] args) throws IOException {
		//get java object of the physical file	
		
		FileInputStream file=new FileInputStream("./data/TestScripData.xlsx");
		 Workbook wb = WorkbookFactory.create(file);
		 String data = wb.getSheet("createcustomer").getRow(1).getCell(0).toString();
		 System.out.println(data);

}
}