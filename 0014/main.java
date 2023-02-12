public class Main
{
    public static void main(String[] args)  
	{
		int i;
		
		System.out.println("increasing the value of i:");
		
		for(i = 0; i <= 3; i++) 
		{
			System.out.println("i: " + i);
		}
		
		System.out.println("decreasing the value of i:");
		
		for( ; i >= 0; i--)
		{
			System.out.println("i: " + i);
		}
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
