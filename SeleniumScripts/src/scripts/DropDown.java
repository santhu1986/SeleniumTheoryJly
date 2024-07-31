package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException 
	{
	
		
		       //Launch Firefox
		
				WebDriver driver=new FirefoxDriver();
				
				//Maximize
				
				driver.manage().window().maximize();
				
				//Url
				
				driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
				
				//Drop Down
				Thread.sleep(3000);
				
			    WebElement Country=driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));
				Select Ctry=new Select(Country);
				
				//Ctry.selectByVisibleText("Australia");
				//Ctry.selectByIndex(3);
				Ctry.selectByValue("Bhutan");
				
				
				//Count The Values in The DropDown
				
				        List<WebElement> AllCtrys=Ctry.getOptions();
				        System.out.println(AllCtrys.size());
				
				     //Loop
				        
				        for(WebElement CTY:AllCtrys)
				        {
				        	System.out.println(CTY.getText());
				        	
				        	if (CTY.getText().equals("India"))
				        	{
								CTY.click();
								break;
							}
				        }
				
				
				
				
				
	}

}
