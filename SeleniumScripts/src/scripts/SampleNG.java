package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleNG
{

	WebDriver driver;
	
	     @BeforeMethod
	     public void xyz()
	     {
	    	 //Launch Browser
	    	 
	    	 driver=new ChromeDriver();
	    	 driver.manage().window().maximize();
	     }
	     
         @Test
	     public void abc() throws InterruptedException
	     {
	    	 //URL
	    	 
	    	 driver.get("http://www.google.com");
	    	 Thread.sleep(3000);
	     }

         @Test(enabled=false)
	     public void bcd() throws InterruptedException
	     {
	    	 //URL
	    	 
	    	 driver.get("http://www.facebook.com");
	    	 Thread.sleep(3000);
	     }

        @AfterMethod
	     public void pqr()
	     {
	    	 //Close Application
	    	 driver.close();
	     }
}
