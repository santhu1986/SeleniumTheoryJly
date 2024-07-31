package scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByPixel {

	public static void main(String[] args) throws InterruptedException 
	{
	
		
       //Chrome Browser
		
        WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://the-internet.herokuapp.com/");
	    
	    Thread.sleep(3000);
	    
	    //To Scroll the Page we have to use JavaScriptExecutor(Interface)
	    
	    JavascriptExecutor Js=(JavascriptExecutor)driver;
	    //Js.executeScript("window.scrollBy(0,500)");
	   
	    Thread.sleep(4000);
	    Js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	    //Js.executeScript("window.scrollBy(0,-200)");
	    
	}

}
