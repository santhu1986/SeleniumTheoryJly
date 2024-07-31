package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
	   	  WebDriver driver=new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    
		    driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		    
		    Thread.sleep(3000);
		    
		    //Source
		    
		    WebElement Rome=driver.findElement(By.id("box6"));
		    
		    //Destination
		    WebElement Italy=driver.findElement(By.id("box106"));
		  
		    //Actions 
		    Thread.sleep(3000);
		    Actions act=new Actions(driver);
		    act.dragAndDrop(Rome,Italy).perform();
	}

}
