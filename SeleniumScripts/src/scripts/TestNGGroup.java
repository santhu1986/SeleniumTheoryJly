package scripts;

import org.testng.annotations.Test;

@Test(groups="all")
public class TestNGGroup 
{

	@Test(groups="smoke")
	public void abc()
	{
		System.out.println("Test1");
	}
	@Test(groups= {"regression"})
	public void pqr()
	{
		System.out.println("Test2");
	}
	@Test
	public void xyz()
	{
		System.out.println("Test3");
	}
	@Test(groups="functional")
	public void bcd()
	{
		System.out.println("Test4");
	}

}
