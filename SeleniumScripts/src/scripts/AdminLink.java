package scripts;

import org.testng.annotations.Test;

public class AdminLink extends Base
{
    @Test
	public void Alink() throws InterruptedException
	{
		LB.AdmLink();
		Thread.sleep(3000);
	}
  
}
