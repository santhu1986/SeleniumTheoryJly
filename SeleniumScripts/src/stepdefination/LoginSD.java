package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSD 
{

	WebDriver driver;

@Given("^User should on Orange Home Page$")
public void user_should_on_Orange_Home_Page() throws Throwable 
{
	driver=new FirefoxDriver();
	
	//Url
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	//Maximize
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	
}

@When("^User enter \"(.*)\" and \"(.*)\" click on login$")
public void user_enter_Username_password_click_on_login(String Un,String Pwd) throws Throwable
{

	 WebElement uname=driver.findElement(By.xpath("//input[@name='username']"));
	  //  System.out.println(uname.getAttribute("class"));
	   Thread.sleep(3000);
	    uname.sendKeys(Un);
	   
	    //Css Selector
	    
	   WebElement Pswd=driver.findElement(By.name("password"));    
	   Pswd.sendKeys(Pwd);
	   
	   //Absolute Xpath
	   
	  // WebElement Login=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	   //Login.click();
	   
}

@Then("^User Validates Login Functionality$")
public void user_Validates_Login_Functionality() throws Throwable 
{
     String Tit=driver.getTitle();
     System.out.println(Tit);
}


}
