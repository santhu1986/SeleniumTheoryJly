package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLocators {

	public static void main(String[] args) throws InterruptedException 
	{
		// Firefox browser
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\LENOVO\\OneDrive\\Desktop\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		//Url
		
		driver.get("http://www.google.com");
		
		//Maximize
		
		driver.manage().window().maximize();
		
		//Email
		
		//driver.findElement(By.id("email")).sendKeys("Santhosh Testing");
		//driver.findElement(By.id("pass")).sendKeys("Automation");
		Thread.sleep(3000);
	//	driver.findElement(By.name("login")).click();
		
		
		//ForGot Password using Link Text
		
	//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//ForGot Password using PartialLink Text
		
	//driver.findElement(By.partialLinkText("Grou")).click();
	
	   //TagName  --- Counting the Links 
		
	//	int linkscount=driver.findElements(By.tagName("a")).size();
	  //  System.out.println(linkscount);
	
		
		//Class Name
		
		driver.findElement(By.className("gLFyf")).sendKeys("Automation");
	
	}

}
