package scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException 
	{
		//Launch Firefox
		
		WebDriver driver=new FirefoxDriver();
		
		//Maximize
		
		driver.manage().window().maximize();
		
		//Url
		
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
		
		Thread.sleep(3000);
		
	//	driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]/button")).click();
		
		//Thread.sleep(3000);
		
		//Alert
		//driver.switchTo().alert().accept();   //OK
		
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[2]/button")).click();
		//Thread.sleep(3000);
		//driver.switchTo().alert().accept();   //OK
		//driver.switchTo().alert().dismiss();   //Cancel

	          driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[3]/button")).click();
	          
	          Thread.sleep(3000);
	          
	          Alert PopUp=driver.switchTo().alert();
	          System.out.println(PopUp.getText());
	          PopUp.sendKeys("Hello World");
	          Thread.sleep(3000);
	          PopUp.accept();
	
	
	}

}
