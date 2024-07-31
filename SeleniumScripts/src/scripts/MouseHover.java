package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException
	{
	
		//Chrome Browser
		
        WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://corporate.spicejet.com/RamMandirInauguration.aspx");
	    
	    Thread.sleep(3000);
	    
	    WebElement Addons=driver.findElement(By.xpath("//a[@id='highlight-addons']"));
	    
	    //Actions
	    
	    Actions act=new Actions(driver);
	    act.moveToElement(Addons).build().perform();
	    Thread.sleep(3000); 
	   
	    //driver.findElement(By.xpath("//a[normalize-space()='SpicePlus']")).click();
	    
	   WebElement SpicePlus=driver.findElement(By.xpath("//a[normalize-space()='SpicePlus']"));

	   act.moveToElement(SpicePlus).click().perform();
	}

}
