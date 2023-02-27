public class Main
{
    	public static void main(String[] args)  
	{
		int a = 10;
		int b = 5; 
		int c = 15;
		
		//|| stands for OR
		
		//true OR true is true
		//true OR false is true
		//false OR true is true
		//false OR false is false
		
		if(a < b || a < c)
		{
			System.out.println("a is smaller than b or a smaller than c");
		}
		
		if(a > b || a < c )
		{
			System.out.println("a is greater than b or a is smaller than c");
		}
		
		if(a > b || a > c)
		{
			System.out.println("a is greater than b or a is greater than c");
		}
		
		if(a < b || a > c)
		{
			System.out.println("a is smaller than b or a is greater than c");
		}
	}
}

/*
a is smaller than b or a smaller than c
a is greater than b or a is smaller than c
a is greater than b or a is greater than c
*/
