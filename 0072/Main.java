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
				int n = array_of_numerators[i];  
				//if an index out of bound error occurs here,
				//we go to catch(ArrayIndexOutOfBoundsException exception_of_out_of_bound_index) directly
				                                 
				System.out.println("n: " + n);
				
				quotient = array_of_numerators[i]/denominator; 
				//if an arithmetic error occurs here,
				//we go to catch(ArithmeticException exception_of_division_by_zero) directly
				
				System.out.println("quotient: " + quotient); 
			}
			catch(ArrayIndexOutOfBoundsException exception_of_out_of_bound_index)
			{
				System.out.println("exception_of_out_of_bound_index: " + exception_of_out_of_bound_index);
			}
			catch(ArithmeticException exception_of_division_by_zero)
			{
				System.out.println("exception_of_division_by_zero  : " + exception_of_division_by_zero);
			}
	
			System.out.println("-------------------------------------------------------------------------------------------------------------");
		}
		
		System.out.println("end of program");
	}
}

/*
i: 0
n: 10
exception_of_division_by_zero  : java.lang.ArithmeticException: / by zero
-------------------------------------------------------------------------------------------------------------
i: 1
n: 20
exception_of_division_by_zero  : java.lang.ArithmeticException: / by zero
-------------------------------------------------------------------------------------------------------------
i: 2
n: 30
exception_of_division_by_zero  : java.lang.ArithmeticException: / by zero
-------------------------------------------------------------------------------------------------------------
i: 3
exception_of_out_of_bound_index: java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
-------------------------------------------------------------------------------------------------------------
i: 4
exception_of_out_of_bound_index: java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
-------------------------------------------------------------------------------------------------------------
end of program
*/

