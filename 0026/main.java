public class Main
{
    public static void main(String[] args)  
	{
		int a;
		double x;
		int integer_result;
		double double_result;
		
		x = 3.14159;
		integer_result = (int)x;  //cast the value stored in x to integer
		System.out.println("integer_result: " + integer_result);
		
		a = 3;
		double_result = (double)a;  //cast the value stored in a to double
		System.out.println("double_result: " + double_result);
	}
}

/*
integer_result: 3
double_result: 3.0
*/
