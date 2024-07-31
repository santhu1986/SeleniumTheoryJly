package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://jqueryui.com/droppable/");
	    
	    Thread.sleep(3000);
	    
	    //Frame
	    
	    driver.switchTo().frame(0); //Index
	    
	    Actions act=new Actions(driver);
	    act.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))
	    .moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().perform();
	  

	}

}
