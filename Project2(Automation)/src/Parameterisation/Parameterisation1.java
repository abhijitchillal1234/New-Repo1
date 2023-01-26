package Parameterisation;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterisation1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		String Path = "C:\\Users\\Ramesh\\Desktop\\Sheet1.xlsx";                     

		FileInputStream FM = new FileInputStream(Path);                         //Create the object of FileInputStream
		
		String Data = WorkbookFactory.create(FM)             //To open an xl sheet we use static method from workbookfactory
				.getSheet("Sheet1")                       //to open an specific sheet we need to use getsheet() method
				        .getRow(1).getCell(0).           //to identify a specific row & column in sheet we use getrow() & getcell() method
				               getStringCellValue();	 //to fetch string type information we need to call getstringvalue()  method	
		
		System.out.println(Data);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
