package Parameterisation;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterisation4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		
		String Path = "C:\\Users\\Ramesh\\Desktop\\Sheet2.xlsx";
		
		FileInputStream File = new FileInputStream(Path);
		
		double Data = WorkbookFactory.create(File).getSheetAt(0).getRow(1).getCell(1).getNumericCellValue();
		
		System.out.println(Data);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
