package scripts;

import org.testng.annotations.Test;

public class LeaveLink extends Base
{
	
	   @Test
	    public void LeaveLnk() throws InterruptedException
	    {
	    	LB.Leave();
	    	Thread.sleep(3000);
	    }

}
