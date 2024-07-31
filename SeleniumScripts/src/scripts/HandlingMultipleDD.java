package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipleDD {

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
				
				//Day
				WebElement Day=driver.findElement(By.xpath("//select[@id='day']"));
				SelectOption(Day,"10");
				
				//Month
				 WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
				 SelectOption(Month,"Aug");
				 
				 //Year
				 WebElement Year=driver.findElement(By.xpath("//select[@id='year']"));
				 SelectOption(Year,"2015");
				}
	
	    public static void SelectOption(WebElement Ele,String Value)
	    {
	                  Select DropDown=new Select(Ele);
	                  
	                  List<WebElement> AllDDvalues=DropDown.getOptions();
	                  
	                  for(WebElement option:AllDDvalues)
	                  {
	                	  if (option.getText().equals(Value))
	                	  {
							option.click();
							break;
						}
	                  }
	    }

}
