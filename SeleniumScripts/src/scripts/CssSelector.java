package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector {

	public static void main(String[] args)
	{
	
		// Firefox browser
		
				System.setProperty("webdriver.gecko.driver","C:\\Users\\LENOVO\\OneDrive\\Desktop\\geckodriver.exe");
				
				WebDriver driver=new FirefoxDriver();
				
				//Url
				
				driver.get("http://www.facebook.com");
				
				//Maximise
				
				driver.manage().window().maximize();
				
				
				//Tag & ID
				
				//driver.findElement(By.cssSelector("input#email")).sendKeys("Automation");
				//driver.findElement(By.cssSelector("#email")).sendKeys("Automation");
				
				
				//Tag & Class
				
				//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Selenium");
				driver.findElement(By.cssSelector(".inputtext")).sendKeys("Selenium");
				
				
				//Tag & Attribute
				
				//driver.findElement(By.cssSelector("input[name=pass]")).sendKeys("Automation");
			//	driver.findElement(By.cssSelector("[name=pass]")).sendKeys("Automation");
				
				//Tag,Class & Attribute
				
				//driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("Automation");
				driver.findElement(By.cssSelector(".inputtext[data-testid=royal_pass]")).sendKeys("Automation");
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

	}

}
