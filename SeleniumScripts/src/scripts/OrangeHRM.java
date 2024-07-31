package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException
	{
		// Firefox browser
		
				System.setProperty("webdriver.gecko.driver","C:\\Users\\LENOVO\\OneDrive\\Desktop\\geckodriver.exe");
				
				WebDriver driver=new FirefoxDriver();
				
				//Url
				
				driver.get("https://opensource-demo.orangehrmlive.com/");
				
				//Maximize
				
				driver.manage().window().maximize();
				Thread.sleep(3000);
				//User Name 
				
				driver.findElement(By.name("username")).sendKeys("Admin");
				driver.findElement(By.name("password")).sendKeys("admin123");
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
				
	}

}
