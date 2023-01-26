package Parameterisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Parameterisation8 {

	public static void main(String[] args) throws IOException {

		String Path = "C:\\Users\\Ramesh\\Desktop\\Sheet4.xlsx";
		
		FileInputStream File = new FileInputStream(Path);
		
		XSSFWorkbook work = new XSSFWorkbook(File);
		
		XSSFSheet Sheet = work.getSheet("Sheet1");
		
		int Row = Sheet.getLastRowNum();
		System.out.println(Row);
		
		int Cell = Sheet.getRow(1).getLastCellNum();
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
