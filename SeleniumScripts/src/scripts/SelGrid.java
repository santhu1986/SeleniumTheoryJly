package scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelGrid 
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
		RemoteWebDriver driver =new RemoteWebDriver(new URL("http://192.168.41.1:4444/wd/hub"),Cap);
		
		 driver.manage().window().maximize();
		   driver.get("https://opensource-demo.orangehrmlive.com");
		   Thread.sleep(3000);
		   //Login
		    OrangeHP OHP=PageFactory.initElements(driver,OrangeHP.class);
		  OHP.OLogin("Admin","admin123");
		  
		  Thread.sleep(3000);
		  
		  OrangeLP OLP=PageFactory.initElements(driver,OrangeLP.class);
		  OLP.LeaveLink();
		 
		  
		
	}
}
