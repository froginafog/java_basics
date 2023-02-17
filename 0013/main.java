public class Main
{
    	public static void main(String[] args)  
	{
		int i = 0;
		
		System.out.println("increasing the value of i:");
		
		while(i <= 3)  //while i is less than or equal to 3
		{
			System.out.println("i: " + i);
			i++;  //increase the value of i by 1
			      //i = i + 1 
		}
		
		System.out.println("decreasing the value of i:");
		
		do
		{
			System.out.println("i: " + i);
			i--;  //decrease the value of i by 1
			      //i = i - 1 
		}while(i >= 0);
	}
}

/*
increasing the value of i:
i: 0
i: 1
i: 2
i: 3
decreasing the value of i:
i: 4
i: 3
i: 2
i: 1
i: 0
*/
