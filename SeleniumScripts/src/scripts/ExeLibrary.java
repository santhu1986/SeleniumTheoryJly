package scripts;

import java.io.IOException;

public class ExeLibrary {

	public static void main(String[] args) throws InterruptedException, IOException
	{
         //Instance Class
		
		Library LB=new Library();
		
		String Rval=LB.OpenApplication("https://opensource-demo.orangehrmlive.com/");
		System.out.println(Rval);
		
		Rval=LB.Login("Admin","admin123");
		System.out.println(Rval);
		LB.Logout();
		LB.Close();
		
	}

}
