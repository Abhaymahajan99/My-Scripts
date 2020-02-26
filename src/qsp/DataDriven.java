package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataDriven {
	public static void main(String[] args) throws IOException {
	//get java object of the physical file	
	
	FileInputStream file=new FileInputStream("./data/commondata.properties");
	//create an object of properties class to load the file
	Properties p=new Properties();
	p.load(file);
	//get the data from properties file by passing key
	String value = p.getProperty("username");
	//print it on the console
	System.out.println(value);

}
}