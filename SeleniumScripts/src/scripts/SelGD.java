package scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelGD 
{

	DesiredCapabilities Cap;
	
	@Parameters("Browser")
	@Test
	public void Grid(String Br) throws MalformedURLException, InterruptedException
	{
		
		if (Br.equalsIgnoreCase("firefox"))
		{
			Cap=new DesiredCapabilities();
			Cap.setBrowserName("firefox");
			Cap.setPlatform(Platform.WINDOWS);
				
		}
		
		else if (Br.equalsIgnoreCase("chrome"))
		{
			Cap=new DesiredCapabilities();
			Cap.setBrowserName("chrome");
			Cap.setPlatform(Platform.WINDOWS);
				
		}
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.41.1:4444/wd/hub"),Cap);
		
		 //Launch Firefox
		   
		   String Expval="Ranford Bank";
		   
		   //Maximise
		   
		   driver.manage().window().maximize();
		   
		   Thread.sleep(3000);
		   //URL
		   
		   driver.get("http://192.168.1.4/ranford2");
		   
		   String Actval=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		   
		   //Comaprision
		   
		   if (Expval.equalsIgnoreCase(Actval))
		   {
			System.out.println("Application Launch Succ");
		   }
		   else
		   {
			   System.out.println("Application Failed To Launch");
		   }
		   
		   
		   //Get Title
		   
		   String Tit=driver.getTitle(); 
		   System.out.println(Tit);
		   
		   //Admin Login
		   Thread.sleep(3000);
		   Expval="Welcome to Admin";
		   
		   driver.findElement(By.id("txtuId")).sendKeys("Admin");
		   driver.findElement(By.id("txtPword")).sendKeys("Admin");
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		   
	       Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
		   
		   //Comaprision
		   
		   if (Expval.equalsIgnoreCase(Actval))
		   {
			System.out.println("Admin Login Succ");
		   }
		   else
		   {
			   System.out.println("Admin Login Failed");
		   }
		   

	}
	
}
