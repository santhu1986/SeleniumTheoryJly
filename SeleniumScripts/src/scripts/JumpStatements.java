package scripts;

public class JumpStatements {

	public static void main(String[] args) 
	{
		
		//For loop
		
		//Break
		
		/*for (int i=1;i<=10;i++)
		{
		System.out.println(i);	
		if (i==5) 
		{
		    break;	//Jump Statement
		}
		}*/
		
		
		//Continue
		
		for (int i=1;i<=10;i++)
		{
			if (i==3 || i==5 || i==7)
			{
			continue;	
			}
		System.out.println(i);	
		}
	}

}
