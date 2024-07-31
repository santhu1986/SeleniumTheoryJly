package scripts;

public class SmallestofThreeNums {

	public static void main(String[] args) 
	{
		int a=15;
		int b=10;
		int c=30;
		
		if ((a<b)&&(a<c))
		{
			System.out.println("Smallest Number is :" +a);
		}
		else if(b<c)
		{
			System.out.println("Smallest Number is :" +b);
		}
		else
		{
			System.out.println("Smallest number is:" +c);
		}
		
	}

}
