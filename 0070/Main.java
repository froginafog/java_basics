//exception handling
//it allows the program to keep running even if an error occurs

class Main
{
	public static void main(String[] args)
	{
		int numerator = 10;
		int denominator = 0;
		int quotient;
		
		try
		{
			quotient = numerator/denominator;  
			//if an arithmetic error occurs here, 
			//we go to catch(ArithmeticException exception) directly
			
			System.out.println("quotient: " + quotient);
		}
		catch(ArithmeticException exception)
		{
			System.out.println("exception: " + exception);
			System.out.println("Division by zero is not allowed");
		}
		
		System.out.println("end of program");
	}
}

/*
exception: java.lang.ArithmeticException: / by zero
Division by zero is not allowed
end of program
*/
