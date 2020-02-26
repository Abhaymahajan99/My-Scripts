package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelScript21 {
	public static void main(String[] args) throws Exception {
		FileInputStream file=new FileInputStream("./data/TestScripData.xlsx");
		//open workbook in read mode
		Workbook wb = WorkbookFactory.create(file);
		// get the control of the sheet
		Sheet sheet = wb.getSheet("CreateCustomer");
		//get the control of 1st row
		Row row = sheet.getRow(1);
		//get the control of the call
		Cell cell = row.getCell(0);
		//read the string data
		String data = cell.toString();
		System.out.println(data);
		
	}
}
