package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerFrame {

	public static void main(String[] args) throws InterruptedException 
	{
	
		    WebDriver driver=new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    
		    driver.get("https://demo.automationtesting.in/Frames.html");
		    
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		    
		    //Swtching into Outter Frame using Webelement
		    
		   WebElement OutterFrame= driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		  driver.switchTo().frame(OutterFrame);
		  Thread.sleep(3000);
		   
		  //Swtiching into Inner Frame
		  
		 WebElement InnerFrame=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		 driver.switchTo().frame(InnerFrame);
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Welcome to Frames");
		 
		 //Swtiching into the Parent Frame
		 Thread.sleep(3000);
		 //driver.switchTo().parentFrame();
		 
		 String Text=driver.findElement(By.xpath("/html/body/section/div/div/h5")).getText();
		 System.out.println(Text);
	}

}
