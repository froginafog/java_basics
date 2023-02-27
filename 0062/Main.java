public class Main
{
    public static void main(String[] args)  
	{	             
		String message = "C++, Java, Python, Javascript";
		int index_of_starting_point = 5;  //inclusive
		int index_of_ending_point = 9;  //exclusive
		String substring_of_message = message.substring(index_of_starting_point, index_of_ending_point);
		
		System.out.println("substring_of_message: " + substring_of_message);
	}
}

/*
substring_of_message: Java
*/
