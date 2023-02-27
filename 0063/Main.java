public class Main
{
    public static void main(String[] args)  
	{	             
		String original_string = "C++, Java, Python, Javascript";
		String original_string_in_upper_case = original_string.toUpperCase();
		String original_string_in_lower_case = original_string.toLowerCase();
		
		System.out.println("original_string_in_upper_case: " + original_string_in_upper_case);
		System.out.println("original_string_in_lower_case: " + original_string_in_lower_case);
	}
}

/*
original_string_in_upper_case: C++, JAVA, PYTHON, JAVASCRIPT
original_string_in_lower_case: c++, java, python, javascript
*/
