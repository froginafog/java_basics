class Main
{
	public static void main(String[] args)
	{
		//exception handling
		//it allows the program to keep running even if an error occurs
		int numerator = 10;
		int denominator = 0;
		int quotient = 0;
		
		System.out.println("denominator: " + denominator);
		try
		{
			quotient = numerator/denominator;
		}
		catch(ArithmeticException exception)
		{
			System.out.println("exception: " + exception);
			System.out.println("Division by zero is not allowed");
		}
		
		System.out.println("-----------------------------------------------------");
		
		denominator = 2;
		System.out.println("denominator: " + denominator);
		try
		{
			quotient = numerator/denominator;
		}
		catch(ArithmeticException exception)
		{
			System.out.println("exception: " + exception);
			System.out.println("Division by zero is not allowed");
		}
		
		System.out.println("quotient: " + quotient);  //this requires "quotient" to be initialized with some value
	}
}

/*
denominator: 0
exception: java.lang.ArithmeticException: / by zero
Division by zero is not allowed
-----------------------------------------------------
denominator: 2
quotient: 5
*/
