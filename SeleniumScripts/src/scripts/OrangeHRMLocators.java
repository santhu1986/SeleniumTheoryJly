package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.seleniumhq.jetty9.util.log.Log;

public class OrangeHRMLocators {

	public static void main(String[] args) throws InterruptedException 
	{
		// Firefox browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\OneDrive\\Desktop\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//Url
		
		driver.get("http://192.168.1.4/ranford2");
		
		//Maximize
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//Login
		
		//Relative Xpath
		
		    WebElement uname=driver.findElement(By.xpath("//input[@name='username']"));
		    System.out.println(uname.getAttribute("class"));
		   Thread.sleep(3000);
		    uname.sendKeys("Admin");
		   
		    //Css Selector
		    
		   WebElement Pswd=driver.findElement(By.cssSelector("input[placeholder='Password']"));    
		   Pswd.sendKeys("admin123");
		   
		   //Absolute Xpath
		   
		   WebElement Login=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		   Login.click();
		   
		   
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
		   
		   Thread.sleep(3000);
		   
		   driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")).click();

		   Thread.sleep(3000);
		   driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();

		   Thread.sleep(3000);
		   
		   driver.close();
		     
		     
		    }
	}