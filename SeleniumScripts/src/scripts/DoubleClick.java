package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException 
	{
		    WebDriver driver=new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    
		    driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		    
		    Thread.sleep(3000);
		    
		    //Swtich To frame
		    
		    driver.switchTo().frame("iframeResult");
		    
		    WebElement Field1=driver.findElement(By.id("field1"));
		    Field1.clear();
		    Thread.sleep(3000);
		    Field1.sendKeys("Welcome to Testing");
		    
		    
		   WebElement Dclick= driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		   
		   
		   //Actions
		   Thread.sleep(3000);
		   Actions act=new Actions(driver);
		   act.doubleClick(Dclick).perform();
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		    
	}

}
