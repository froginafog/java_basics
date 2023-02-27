public class Main
{
    	public static void main(String[] args)  
	{
		int a = 10;
		int b = 5;
		
		if(a < b)  //This condition gets evaluated first.
		{
			System.out.println("a is less than b");  
		}
		else if(a <= b)  //This condition gets evaluated second.
		{
			System.out.println("a is less than or equal to b");
		}
		else if(a == b)  
		{
			System.out.println("a is equal to b");
		}
		else if(a >= b) 
		{
			System.out.println("a is greater than or equal to b");
		}
		else  
		{
			//We enter this instance if all of the conditions above are evaluated as false.
			System.out.println("a is greater than b");
		}
		
		//If any of these conditions is evaluated as true, then the rest will be skipped.
	}
}

/*
a is greater than or equal to b
*/
