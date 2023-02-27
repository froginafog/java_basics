public class Main
{
    	public static void main(String[] args)  
	{
		char[] array_of_characters = {'A', 'B', 'C'};
		int[] array_of_integers = {10, 20, 30};  
		double[] array_of_doubles = {12.34, 23.45, 34.56};
		String[] array_of_strings = {"One", "Two", "Three"};
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println("array_of_characters[" + i + "]: " + array_of_characters[i]);
		}
		
		System.out.println("----------------------------------");
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println("array_of_integers[" + i + "]: " + array_of_integers[i]);
		}
		
		System.out.println("----------------------------------");
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println("array_of_doubles[" + i + "]: " + array_of_doubles[i]);
		}
		
		System.out.println("----------------------------------");
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println("array_of_strings[" + i + "]: " + array_of_strings[i]);
		}
	}
}

/*
array_of_characters[0]: A
array_of_characters[1]: B
array_of_characters[2]: C
----------------------------------
array_of_integers[0]: 10
array_of_integers[1]: 20
array_of_integers[2]: 30
----------------------------------
array_of_doubles[0]: 12.34
array_of_doubles[1]: 23.45
array_of_doubles[2]: 34.56
----------------------------------
array_of_strings[0]: One
array_of_strings[1]: Two
array_of_strings[2]: Three
*/
