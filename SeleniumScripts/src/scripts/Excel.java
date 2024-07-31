package scripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

 
	public static void main(String[] args) throws IOException 
	{
	
		
		//To get The Excel File
		
		FileInputStream Fis=new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\ExcelData.xlsx");
		
		//WorkBook
		
		XSSFWorkbook WB=new XSSFWorkbook(Fis);
		
		//Sheet
		
		XSSFSheet WS=WB.getSheet("Data");
		
		//Row Count
		
		        int Rcount=WS.getLastRowNum();
		        System.out.println("Row Count" + Rcount);
		        
		// Column Count
		        
		        int Ccount=WS.getRow(1).getLastCellNum();
		         System.out.println("Column Count" + Ccount);
		         
		         
		         
		         
		         //Multiple Iterations --------------- Loop
				  
				  for (int i=0;i<=Rcount;i++)   // Rows
				  {
					XSSFRow WR=WS.getRow(i);  // 0
					for (int j=0;j<Ccount;j++)  //Columns
					{
						XSSFCell WC=WR.getCell(j);
						
						switch(WC.getCellType())
						{
						case STRING:
							System.out.print(WC.getStringCellValue());
							break;
						case NUMERIC:
							System.out.print(WC.getNumericCellValue());
							break;
						case BOOLEAN:
							System.out.print(WC.getBooleanCellValue());
							break;
						}
						System.out.print(" | ");
					}
					System.out.println();
				}
				  
				  
	}
}
			
		         
		// Get Particular Cell Value
		         
		      //   int CellValue=(int) WS.getRow(5).getCell(2).getNumericCellValue();
		        // System.out.println(CellValue);
		         
		         
		         
		         //Loop ------ For loop
		         
		       /*  for (int i=1;i<=Rcount;i++)             // Rows
		        {
				XSSFRow WR=WS.getRow(i);	//0
				 
					XSSFCell WC=WR.getCell(0);
				     XSSFCell WC1=WR.getCell(1);
				     XSSFCell WC2=WR.getCell(2);
				     
				     System.out.println(WC.getStringCellValue());
				     System.out.println(WC1.getStringCellValue());
				     System.out.println(WC2.getStringCellValue());

				     
				     
		        }
	}
}
*/	
		      /*   for (int i=0;i<=Rcount;i++)
		         {
		        	 
		         XSSFRow WR=WS.getRow(i);
		         for (int j=0;j<=Ccount;j++) 
		         {
					XSSFCell WC=WR.getCell(j);
		         
				switch(WC.getCellType())
					{
					   case STRING:
						   System.out.print(WC.getStringCellValue());
						   break;
					   case NUMERIC:
						   System.out.print(WC.getNumericCellValue());
						   break;
					   case BOOLEAN:
						   System.out.print(WC.getBooleanCellValue());
						   break;
					}
					
					System.out.print(" | ");
		         }
		         System.out.println();
		         }
	}
	}
*/