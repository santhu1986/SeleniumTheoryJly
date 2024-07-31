package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import org.testng.annotations.AfterSuite;

public class Base {
 
	
	Library LB=new Library();
	
  @Test(dataProvider="OrangeData")
  public void OrangeLogin(String Un,String Pwd) throws InterruptedException 
  {
  LB.Login(Un,Pwd);
  }

  @AfterTest   //Log out
  public void OLogout() throws InterruptedException 
  {
  LB.Logout();
  }

  @BeforeTest  //  Launch
  public void OrangeLaunch() throws InterruptedException, IOException 
  {
      LB.OpenApplication("https://opensource-demo.orangehrmlive.com");
      Thread.sleep(3000);
  }
  
  @DataProvider
   public Object [][] OrangeData()
  {
	  Object[][] Obj=new Object[3][2];
	  
	  Obj[0][0]="Admin";
	  Obj[0][1]="admin";
	  

	  Obj[1][0]="Adminabc";
	  Obj[1][1]="admin";
	  

	  Obj[2][0]="Adminpqr";
	  Obj[2][1]="admin";
	  
	  
	  return Obj;
	  
	  
  }
  
  
  
  

 /* @AfterSuite     //Close
  public void OClose() throws InterruptedException 
  {
  LB.Close();
  }*/

}
