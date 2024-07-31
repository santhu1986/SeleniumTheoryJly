package scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeLP 
{

	//EP
	
	@FindBy(xpath="//span[normalize-space()='Admin']")
	WebElement Admin;

	@FindBy(xpath="//span[normalize-space()='Leave']")
	WebElement Leave;
	
	//EM
	
	public void AdmLink()
	{
		Admin.click();
	}

	public void LeaveLink()
	{
		Leave.click();
	}
}
