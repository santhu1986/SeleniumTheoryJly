package scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class OrangeHP 
{

	
	//Element Properties
	
	@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	WebElement Uname;
	
	@FindBy(name="password")
	WebElement Pswd;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement Login;
	
	//Element Methods
   
	public void OLogin(String Un,String Pwd) throws InterruptedException 
	{
		Uname.sendKeys(Un);
		Pswd.sendKeys(Pwd);
		Thread.sleep(3000);
		//Uname.clear();
		//Thread.sleep(3000);
		//Pswd.clear();
	//	Thread.sleep(3000);
		Login.click();
		
	}
	
}
