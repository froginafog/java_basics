public class Main
{
    public static void main(String[] args)  
	{
		int a = 3;
		double x = 12.3456789;
		String message = "Hello Coder";
		
		System.out.printf("|%3d|\n", a);
		//reserve 3 spaces to print an integer, right justified
	
		System.out.printf("|%8.3f|\n", x);
		//reserve 8 places to print a floating point number with up to digits after the decimal point, right justified
		
		System.out.printf("|%13s|\n", message);
		//reserve 13 places to print a string, right justified
	}
}

/*
|  3|
|  12.346|
|  Hello Coder|
*/
