package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCFrame {

	public static void main(String[] args) throws InterruptedException 
	{
	
		
    WebDriver driver=new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.get("https://netbanking.hdfcbank.com/netbanking/");
    
    Thread.sleep(3000);
    
    //driver.findElement(By.xpath("/html/body/div[1]/form/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/input")).sendKeys("458795");
	
	//No of frames are Available in The Page
    
            List<WebElement> Frames=driver.findElements(By.tagName("frame"));
            System.out.println(Frames.size());
	
	      for(WebElement Fr:Frames)
	      {
	    	  System.out.println(Fr.getAttribute("name")); 
				
			}
	  
	
	   // driver.switchTo().frame("login_page");    //Frame Name
	    
	     // driver.switchTo().frame(0);   //Index
	      
	      //Frame with Webelement
	      
	     WebElement FrameName= driver.findElement(By.name("login_page"));
	      
	     driver.switchTo().frame(FrameName);   //Webelemnt
	      Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/div[1]/form/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/input")).sendKeys("458795");
		
	}

}
