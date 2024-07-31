package scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OrangeExcel {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		//Instance Class
		
		Library LB=new Library();
		
		LB.OpenApplication("https://opensource-demo.orangehrmlive.com");
		
		//To Get the Excel File
		
		FileInputStream FIS=new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\OrangeHRM Excel.xlsx");
		
		//WorkBook
		
		XSSFWorkbook WB=new XSSFWorkbook(FIS);
		
		//Sheet
		
		XSSFSheet WS=WB.getSheet("LoginData");
		
		//Row Count
		
		int Rc=WS.getLastRowNum();
	    System.out.println(Rc);
	    
	    //Multiple Iterations ----- Loop
	    
	    for (int i=1;i<=Rc;i++) 
	    {
		    //Row
	    	
	    	XSSFRow WR=WS.getRow(i);
	    	
	    	//Cells
	    	
	    	XSSFCell WC=WR.getCell(0);   // UserName
	    	XSSFCell WC1=WR.getCell(1);  // Password
	    	
	    	//Create Cell
	    	
	    	XSSFCell WC2=WR.createCell(2);
	    	//Cell Values
	    	
	    	String Uname=WC.getStringCellValue();
	    	String Pwd=WC1.getStringCellValue();
	    	
	    	//Login
	    	
	    	String Rval=LB.Login(Uname,Pwd);
	    	WC2.setCellValue(Rval);
		}
	     FileOutputStream Fos=new FileOutputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\ResultOrangeHRM Excel.xlsx");
	     WB.write(Fos);
	     WB.close();
	
	
	}

}
