package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByElement {

	public static void main(String[] args) throws InterruptedException
	{
		
  //Chrome Browser
		
        WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
	    
	    Thread.sleep(8000);
	    
	    Thread.sleep(3000);
	    
	    
	    //India Flag Element Property
	    
	    WebElement IndiaFlag=driver.findElement(By.xpath("//td[normalize-space()='India']"));
	    
	    Thread.sleep(3000);
	    
	    //To Scroll the Page we have to use JavaScriptExecutor(Interface)
	    
	    JavascriptExecutor Js=(JavascriptExecutor)driver;
	    Js.executeScript("argument[0].scrollIntoView();",IndiaFlag);
	
	
		
	}

}
