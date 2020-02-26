package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author Asus
 *it is generic class to read the data from properties and excel file
 */

public class FileLib {
	/**
	 * this method is used to read data from property file
	 * @param string 
	 * @param key
	 * @return the data from property file
	 * @throws IOException
	 */
	public String getPropertyData(String key) throws IOException {
		FileInputStream file=new FileInputStream("./data/commondata.properties");
		Properties p=new Properties();
		p.load(file);
		String data = p.getProperty(key);
		return data;
	}
	/**
	 * this method is used to read the data from excel file
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return excel data from excel sheet
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public String getExcelData(String sheetname, int row ,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("./data/ExcelScript3.xlsx");
		Workbook wb= WorkbookFactory.create(file);
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).toString();
		
		
		return data;
		
		
	}
	/**
	 * to write the data back to excel file
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @param data
	 * @throws Exception
	 */
	
	public void setExcelData(String sheetname,int row ,int cell,String data) throws Exception {
		FileInputStream file=new FileInputStream("./data/ExcelScript3.xlsx");
		Workbook wb= WorkbookFactory.create(file);
		wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(data);;
		FileOutputStream fos= new FileOutputStream("./data/ExcelScript3.xlsx");
		wb.write(fos);
		 wb.close();
		
		
		
		
		

}}
