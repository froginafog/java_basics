public class Main
{
    public static void main(String[] args)  
	{	             
		String original_string = "C++, Java, Python, Javascript";
		String sought_string_1 = "Python";
		String sought_string_2 = "Ruby";
		
		System.out.println("original_string: " + original_string);
		
		//original_string.contains(sought_string_1) returns true if sought_string_1 is found in original_string
		//original_string.contains(sought_string_1) returns false if sought_string_1 is not found in original_string
		
		if(original_string.contains(sought_string_1))
		{
			System.out.println("\"" + sought_string_1 + "\"" + " is found in original_string");  
		}
		else
		{
			System.out.println("\"" + sought_string_1 + "\"" + " is not found in original_string");  
		}
		
		if(original_string.contains(sought_string_2))
		{
			System.out.println("\"" + sought_string_2 + "\"" + " is found in original_string");  
		}
		else
		{
			System.out.println("\"" + sought_string_2 + "\"" + " is not found in original_string");  
		}
	}
}

/*
original_string: C++, Java, Python, Javascript
"Python" is found in original_string
"Ruby" is not found in original_string
*/
