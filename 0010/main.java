public class Main
{
    public static void main(String[] args)  
	{
		int a = 10;
		int b = 5; 
		int c = 15;
		
		//&& stands for AND
		
		//true AND true is true
		//true AND false is false
		//false AND true is false
		//false AND false is false
		
		if(a < b && a < c)
		{
			System.out.println("a is smaller than b and a smaller than c");
		}
		
		if(a > b && a < c )
		{
			System.out.println("a is greater than b and a is smaller than c");
		}
		
		if(a > b && a > c)
		{
			System.out.println("a is greater than b and a is greater than c");
		}
		
		if(a < b && a > c)
		{
			System.out.println("a is smaller than b and a is greater than c");
		}
	}
}

/*
a is greater than b and a is smaller than c
*/
