package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException 
	{
	
		   WebDriver driver=new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    
		    driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		    
		    Thread.sleep(3000);
		    
		   WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		   
		   //Actions
		   
		   Thread.sleep(3000);
		   
		   Actions act=new Actions(driver);
		  act.contextClick(button).build().perform();

	}

}
