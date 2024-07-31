package scripts;

import org.testng.annotations.Test;

public class TestNgGroup1 
{

	@Test(groups="smoke")
	public void abc()
	{
		System.out.println("Test5");
	}
	@Test(groups= {"regression"})
	public void pqr()
	{
		System.out.println("Test6");
	}
	@Test(groups="smoke")
	public void xyz()
	{
		System.out.println("Test7");
	}
	@Test(groups="functional")
	public void bcd()
	{
		System.out.println("Test8");
	}

}
