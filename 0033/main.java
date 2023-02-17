public class Main
{
	static void function_1() 
	{
		System.out.println("inside function_1");
		System.out.println("invoking function_2");
		function_2();
	}
	
	static void function_2() 
	{
		System.out.println("inside function_2");
		System.out.println("invoking function_3");
		function_3();
	}
	
	static void function_3() 
	{
		System.out.println("inside function_3");
	}
	
    public static void main(String[] args)  
	{
		System.out.println("calling function_1");
		function_1();
	}
}

/*
calling function_1
inside function_1
invoking function_2
inside function_2
invoking function_3
inside function_3
*/
