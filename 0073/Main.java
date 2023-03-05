class Main
{
	public static void main(String[] args)
	{
		int[] array_of_numerators = {10, 20, 30};
		int denominator = 0;
		int quotient;
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("i: " + i);
			try
			{
				int numerator = array_of_numerators[i];
				System.out.println("numerator: " + numerator);
				try
				{
					quotient = numerator/denominator;
					System.out.println("quotient: " + quotient);
				}
				catch(ArithmeticException exception_of_division_by_zero)
				{
					System.out.println("exception_of_division_by_zero  : " + exception_of_division_by_zero);
				}
				System.out.println("-------------------------------------------------------------------------------------------------------------");
			}
			catch(ArrayIndexOutOfBoundsException exception_of_out_of_bound_index)
			{
				System.out.println("exception_of_out_of_bound_index: " + exception_of_out_of_bound_index);
			}
			System.out.println("=============================================================================================================");
		}	
		
		System.out.println("end of program");
	}
}

/*
i: 0
numerator: 10
exception_of_division_by_zero  : java.lang.ArithmeticException: / by zero
-------------------------------------------------------------------------------------------------------------
=============================================================================================================
i: 1
numerator: 20
exception_of_division_by_zero  : java.lang.ArithmeticException: / by zero
-------------------------------------------------------------------------------------------------------------
=============================================================================================================
i: 2
numerator: 30
exception_of_division_by_zero  : java.lang.ArithmeticException: / by zero
-------------------------------------------------------------------------------------------------------------
=============================================================================================================
i: 3
exception_of_out_of_bound_index: java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
=============================================================================================================
i: 4
exception_of_out_of_bound_index: java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
=============================================================================================================
end of program
*/
