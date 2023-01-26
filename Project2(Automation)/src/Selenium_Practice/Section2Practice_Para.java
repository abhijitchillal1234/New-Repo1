package Selenium_Practice;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Section2Practice_Para {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String Path = "C:\\Users\\Ramesh\\Desktop\\Employee.xlsx";
		
		FileInputStream File = new FileInputStream(Path);
		
		XSSFWorkbook Work = new XSSFWorkbook(File);
		
		XSSFSheet Sheet = Work.getSheetAt(0);
		
		int Row = Sheet.getLastRowNum();              //4
		System.out.println(Row);

		int Cell = Sheet.getRow(0).getLastCellNum();  //6
		System.out.println(Cell);
		
		for(int R=0;R<=Row;R++) {
			
			XSSFRow row = Sheet.getRow(R);
			
			for(int C=0;C<Cell;C++) {
				
				String cell = row.getCell(C).toString();
				System.out.print(" | "+cell);
				
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
	}

}
