package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestionsDropDown {

	public static void main(String[] args) throws InterruptedException 
	{
       // Launch Browser
		
	    WebDriver driver=new FirefoxDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.skyscanner.co.in/");
	    
	    Thread.sleep(3000);
	    
	    WebElement Source=driver.findElement(By.xpath("//input[@id='originInput-input']"));
	    Source.sendKeys("Hyderabad");
	    Thread.sleep(3000);
	    Source.sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(3000);
	    Source.sendKeys(Keys.ENTER);
	    
	    WebElement Destination=driver.findElement(By.xpath("//input[@id='destinationInput-input']"));
	    Destination.sendKeys("Banguluru");
	    Thread.sleep(3000);
	    Destination.sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(3000);
		  Destination.sendKeys(Keys.ENTER);
	    
	
	}

}
