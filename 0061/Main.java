public class Main
{
    	public static void main(String[] args)  
	{	             
		String message = "Java Program";
		int num_characters = message.length();  //number of characters in the string
		char[] array_of_characters = new char[num_characters];  //create an array of characters
		
		//convert a string into an array of characters
		for(int i = 0; i < num_characters; i++)
		{
			array_of_characters[i] = message.charAt(i);
			//message.charAt(i) returns the character at index i of message
		}
		
		int num_items = array_of_characters.length;  //number of items in an array
		for(int i = 0; i < num_items; i++)
		{
			System.out.print(array_of_characters[i]);
		}
		System.out.println();
	}
}

/*
Java Program
*/
