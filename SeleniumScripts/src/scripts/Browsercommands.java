package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsercommands 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// Chrome Browser
		
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumTheoryMay\\SeleniumScripts\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//URL --- Get
		
		driver.get("http://www.facebook.com");
	  	
		//Maximize
		
		driver.manage().window().maximize();
		
		//Get Title
		
		//System.out.println(driver.getTitle());
	
		String Tit=driver.getTitle();
	    System.out.println(Tit);
	    
	    //Length of string
	    
	    System.out.println(Tit.length());
	    
	    //Get Current URL
	    
	    String Url=driver.getCurrentUrl();
	    System.out.println(Url);
	    
	    //Page Source
	    
	    String Source=driver.getPageSource();
	    System.out.println(Source);
	    
	    //Wait
	    
	    Thread.sleep(3000);
	    
	    
	    //Navigate.to
	    
	    driver.navigate().to("http://www.gmail.com");
	    
	    //Navigate.back
	    
	    Thread.sleep(3000);
	    
	    driver.navigate().back();
	    
	    //Forward
	    
	    Thread.sleep(3000);
	    driver.navigate().forward();
	    
	    //Refresh
	    Thread.sleep(3000);
	    driver.navigate().refresh();
	    
	    //Close
	    
	    Thread.sleep(3000);
	    driver.quit();
	}

}
