package scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Library 
{

	public static WebDriver driver;
	public static FileInputStream Fis;
	public static  Properties Pr;
	
	
	public String OpenApplication(String URL) throws InterruptedException, IOException
	{
        
		
		Fis=new FileInputStream("D:\\SeleniumTheoryMay\\SeleniumScripts\\src\\scripts\\Repository.properties");
		Pr=new Properties();
		Pr.load(Fis);
		
		
		
		driver=new FirefoxDriver();
		
		//Url
		
		driver.get(URL);
		
		//Maximize
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		return "Application Launch Succ";
		
	}
	
	public String Login(String Un,String Pwd) throws InterruptedException 
	{
		  WebElement uname=driver.findElement(By.xpath(Pr.getProperty("Uname")));   //Uname
		  Thread.sleep(3000);
		  uname.sendKeys(Un);
		   
		    //Css Selector
		    
		   WebElement Pswd=driver.findElement(By.name(Pr.getProperty("Pswd")));    
		   Pswd.sendKeys(Pwd);
		   
		   Thread.sleep(3000);
		   driver.navigate().refresh();
		   Thread.sleep(3000); 
		   //Absolute Xpath
		   
		 // WebElement Login=driver.findElement(By.xpath(Pr.getProperty("Lgn")));
		  //Login.click();
		  //Thread.sleep(3000);
		  
		   return "pass";
	}
	
	public void AdmLink() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		Thread.sleep(3000);
	}
	
	public void Leave() throws InterruptedException 
	{
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a/span")).click();
		Thread.sleep(3000);
	}
	public void Logout() throws InterruptedException
	{
		Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")).click();

		   Thread.sleep(3000);
		   driver.findElement(By.xpath(Pr.getProperty("LOut"))).click();

	}
	
	public void Close() throws InterruptedException
	{
		  Thread.sleep(3000);
		driver.close();
	}
	
	}
