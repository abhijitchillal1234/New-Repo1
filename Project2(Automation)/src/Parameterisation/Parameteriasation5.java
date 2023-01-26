package Parameterisation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Parameteriasation5 {

	public static void main(String[] args) throws IOException {

		
		String Path =  "C:\\Users\\Ramesh\\Desktop\\Sheet2.xlsx";
		
		FileInputStream File = new FileInputStream(Path);
		
		XSSFWorkbook work = new XSSFWorkbook(File);
		
		XSSFSheet sheet = work.getSheet("Sheet1");
		
		int Row = sheet.getLastRowNum();                //5         
		
		System.out.println(Row);
		
		int Cell = sheet.getRow(0).getLastCellNum();     //2
		
		System.out.println(Cell);
		
	   for(int R=0;R<Row;R++) {
			
			XSSFRow row = sheet.getRow(R);
			
			for(int C=0;C<Cell;C++) {
				
				XSSFCell cell = row.getCell(C);
				
				switch(cell.getCellType()){
				
				case STRING :
					System.out.print(cell.getStringCellValue());
					break;
					
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
					
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
					
				default:
					System.out.print("Different type of data");
				}
				System.out.print(" | ");
				
			}
			
					System.out.println("");
				
		 }
		
		
	 }
	
  }
		
		
		
	
		
		
		
		
		
		
		
	


