package Parameterisation;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterisation2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String Path = "C:\\Users\\Ramesh\\Desktop\\Sheet1.xlsx";
		
		FileInputStream file = new FileInputStream(Path);
		
		String Data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(Data);
		
		
		
		
		
		
		
		

	}

}
