package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleKeyBoardEvents {

	public static void main(String[] args) throws InterruptedException 
	{
		// Launch Browser
		
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://text-compare.com/");
	    
	    Thread.sleep(3000);
	
	      WebElement InputField=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
	      InputField.sendKeys("Hello Welcome to Automation");
	      
	      //Ctrl+A To Select the Data
	      
	      Actions act=new Actions(driver);
	      
	      act.keyDown(Keys.CONTROL);
	      act.sendKeys("a");
	      act.keyUp(Keys.CONTROL);
	      act.perform();
	      
	      Thread.sleep(3000);
		     
	      //Copy the Data ---- Ctrl+c
	
	      act.keyDown(Keys.CONTROL);
	      act.sendKeys("c");
	      act.keyUp(Keys.CONTROL);
	      act.perform();
	     
	      Thread.sleep(3000);
		     
	      //Shift to the next field ---Tab
	     
	   act.sendKeys(Keys.TAB);
	      act.perform();
	      
	     // driver.findElement(By.xpath("//textarea[@id='inputText2']")).click();
	      
	      Thread.sleep(3000);
	      
	      //Paste the Data ----- Ctrl+v
	      
	      act.keyDown(Keys.CONTROL);
	      act.sendKeys("v");
	      act.keyUp(Keys.CONTROL);
	      act.perform();
	      
	      
	
	
	}
	
	
	

}
