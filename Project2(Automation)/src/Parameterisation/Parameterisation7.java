package Parameterisation;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Parameterisation7 {

	public static void main(String[] args) throws IOException {

		String Path ="C:\\Users\\Ramesh\\Desktop\\Sheet4.xlsx";
		
		FileInputStream File = new FileInputStream(Path);
		
		XSSFWorkbook work = new XSSFWorkbook(File);
		
		XSSFSheet Sheet = work.getSheet("Sheet1");
		
		int Row = Sheet.getLastRowNum();
		System.out.println(Row);
		
		int Cell = Sheet.getRow(1).getLastCellNum();
		System.out.println(Cell);
		
	//Using To string method----------------------------
		
		  //     R=0 0<6   
		  //     R=1 1<6
		for(int R=0;R<=Row;R++) {
			
			     //               0
			XSSFRow row = Sheet.getRow(R);
			
			    //   C=0 0<3           //true
			    //   C=1 1<3           //true
			    //   C=2 2<3          //true
			    //   C=3 3<3          //false
			for(int C=0;C<Cell;C++) {
				
                 //              0 		0	
				 //              0      1
				 //              0      2
				String Value = row.getCell(C).toString();
				
				
	                    //         |  Student 
				        //         |   Roll no.
				        //         |   Mobile no
				System.out.print(" | "+Value);
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
