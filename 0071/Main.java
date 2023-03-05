class Main
{
	public static void main(String[] args)
	{
		int[] array_of_integers = {10, 20, 30};
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("i: " + i);
			try
			{
				int n = array_of_integers[i];  
				//if an index out of bound error occurs here
				//we go to catch(ArrayIndexOutOfBoundsException exception) directly
				
				System.out.println("n: " + n);
				
			}
			catch(ArrayIndexOutOfBoundsException exception)
			{
				System.out.println("exception: " + exception);
				System.out.println("index " + i  + " is out of bound");
			}
			System.out.println("---------------------------------------------------------------------------------------");
		}
		
		System.out.println("end of program");
	}
}

/*
i: 0
n: 10
---------------------------------------------------------------------------------------
i: 1
n: 20
---------------------------------------------------------------------------------------
i: 2
n: 30
---------------------------------------------------------------------------------------
i: 3
exception: java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
index 3 is out of bound
---------------------------------------------------------------------------------------
i: 4
exception: java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
index 4 is out of bound
---------------------------------------------------------------------------------------
end of program
*/
