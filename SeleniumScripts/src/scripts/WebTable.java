package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException 
	{
		
        WebDriver driver=new FirefoxDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.w3schools.com/html/html_tables.asp");
	    
	    Thread.sleep(3000);
	    
	    //Table Row Count
	    
	    int RowCount=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
	    System.out.println("Table RowCount is " + RowCount);
	    
	    //Column Count
	    
	    int ColumnCount=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
	    System.out.println("Table Column Count is "+ ColumnCount);
	    
	    //To get Specific Cell Value/Data from Webtable
	    
	       String CellValue=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[2]")).getText();
	      System.out.println(CellValue);
	    
	    //Specific Row
	    
	    String SRow=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[5]")).getText();
	    System.out.println("5th Row Data"+ SRow);
	    
	    //Specific Column Data
	    
	/*    List<WebElement> CData=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
	    
	    //For Each loop
	    
	    for(WebElement Data:CData)
	    {
	    	System.out.println(Data.getText()); // 1st Germany 2nd Mexico
	    }
	*/    
	    
	// All Table Info
	    
	   // WebElement Table=driver.findElement(By.xpath("//table[@id='customers']"));
	    //System.out.println(Table.getText());
	    
	    //To retrive Table Data using Loop
	    
	    for (int r=2;r<=RowCount;r++) // Loop for Rows  1st Row 2 nd Row
	    {
	    	for (int c=1;c<=ColumnCount;c++)  // Loop For Columns
	    	{
				String AllData=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td["+c+"]")).getText();
			    System.out.print(AllData);
	    	}
			System.out.println();
		}
	    
	    
	    
	    
	}

}
