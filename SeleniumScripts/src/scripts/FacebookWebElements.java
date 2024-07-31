package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookWebElements {

	public static void main(String[] args) throws InterruptedException
	{
		
		
		//Launch Firefox
		
		WebDriver driver=new FirefoxDriver();
		
		//Maximize
		
		driver.manage().window().maximize();
		
		//Url
		
		driver.get("http://www.facebook.com");
		
		
		Thread.sleep(3000);
		
		//Create Account
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
	
		Thread.sleep(3000);
	
	    WebElement Email=driver.findElement(By.name("firstname"));
	    System.out.println("Display Status " + Email.isDisplayed());      //True
	    System.out.println("Enable Status " + Email.isEnabled());    // True
	    Email.sendKeys("Santhosh");
	    
	    
	    //DropDown & Radio ------------- isSelected
	    
	    WebElement Gender=driver.findElement(By.xpath("//label[normalize-space()='Male']"));
	    System.out.println(Gender.isSelected()); // False
	  //  Gender.click();
	
	
	}

}
