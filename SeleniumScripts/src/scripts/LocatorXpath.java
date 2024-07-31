package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorXpath {

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\LENOVO\\OneDrive\\Desktop\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		//Url
		
		driver.get("http://www.facebook.com");
		
		//Maximise
		
		driver.manage().window().maximize();
		
		//Email,Password using ------- Absolute xPath
		
	//	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("Selenium");
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("Automation");
	
	
	     //Email,password using Relative xPath
	
	     // driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Selenium");
	     // driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Automation");
	
		
		//Xpath ----- Or
		
		//driver.findElement(By.xpath("//input[@id='email' or @name='email']")).sendKeys("Automation");
	
		
		//xPath ---------- and
		
		//driver.findElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("Automation");
		
	   //Xpath ------------ Contains()
	
	
		//driver.findElement(By.xpath("//input[contains(@id,'ail')]")).sendKeys("Automation");
	
	
	    //xPath -------------- Startswith
		
		//driver.findElement(By.xpath("//input[starts-with(@id,'ail')]")).sendKeys("Automation");
		
		//xPath ---- text()
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	
	
	
	
	}

}
