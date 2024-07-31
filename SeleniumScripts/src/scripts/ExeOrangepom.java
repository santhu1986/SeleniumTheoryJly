package scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExeOrangepom 
{

	WebDriver driver;
	
	   @BeforeTest
	   public void Launch() throws InterruptedException
	   {
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://opensource-demo.orangehrmlive.com");
		   Thread.sleep(3000);
	   }
	   
	   @Test(dataProvider="OrangeData")
	   public void OLogin(String Uname,String Pwd) throws InterruptedException, IOException
	   {
		
		   //Login
		    OrangeHP OHP=PageFactory.initElements(driver,OrangeHP.class);
		  OHP.OLogin(Uname,Pwd);
		   
		  Thread.sleep(3000);
	   }  
	   
	   @DataProvider
	   public Object [][] OrangeData()
	  {
		  Object[][] Obj=new Object[3][2];
		  
		  Obj[0][0]="Admin";
		  Obj[0][1]="admin";
		  

		  Obj[1][0]="Adminabc";
		  Obj[1][1]="admin";
		  

		  Obj[2][0]="Adminpqr";
		  Obj[2][1]="admin";
		  
		  
		  return Obj;
		  
		  
	  }

	   }
	  /* @AfterTest
	   public void Leave() 
	   {
		   
		  OrangeLP OLP=PageFactory.initElements(driver,OrangeLP.class);
		  OLP.LeaveLink();
		  
	   }*/
	

