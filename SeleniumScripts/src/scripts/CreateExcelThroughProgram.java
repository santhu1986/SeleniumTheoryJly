package scripts;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelThroughProgram {

	public static void main(String[] args) throws IOException 
	{
		
		//Create Excel File In Runtime
		
		FileOutputStream Fos=new FileOutputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\RuntimeExcel.xlsx");
		
        //WorkBook
		
		XSSFWorkbook WB=new XSSFWorkbook();
		
		//Sheet
		
		XSSFSheet WS=WB.createSheet("DataSheet");
		
		//Create Row ------- Row 1
		
		XSSFRow Row1=WS.createRow(0);
		
		//Cells
		
		Row1.createCell(0).setCellValue("Candidate Name");
		Row1.createCell(1).setCellValue("Candidate Email ID");
		
		//Create Row ------- Row 2
		
        XSSFRow Row2=WS.createRow(1);
		
		//Cells
		
		Row2.createCell(0).setCellValue("Santhosh");
		Row2.createCell(1).setCellValue("Santhosh@mindq.com");
		
         //Create Row ------- Row 3
		
        XSSFRow Row3=WS.createRow(2);
		
		//Cells
		
		Row3.createCell(0).setCellValue("Rahul");
		Row3.createCell(1).setCellValue("Rahul@mindq.com");
		
		//Write
		
		WB.write(Fos);
	}

}
