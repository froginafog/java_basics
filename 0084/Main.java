import java.util.ArrayList;
//an ArrayList is an array which can be resized

class Main
{
	public static void main(String[] args)
	{
		ArrayList<String> array_list_of_strings = new ArrayList<String>();
		
		array_list_of_strings.add("First");
		//array_list_of_strings = ["First"]
		
		array_list_of_strings.add("Second");
		//array_list_of_strings = ["First", "Second"]
		
		array_list_of_strings.add("Third");
		//array_list_of_strings = ["First", "Second", "Third"]
		
		System.out.println("array_list_of_strings: " + array_list_of_strings);  
		System.out.println();
		
		int num_items = array_list_of_strings.size();
		for(int i = 0; i < num_items; i++)
		{
			System.out.print("array_list_of_strings.get(" + i + "): ");
			System.out.println(array_list_of_strings.get(i));
		}
		
		System.out.println("\n-------------------------------------------------\n");
		
		array_list_of_strings.set(0, "One");
		//array_list_of_strings = ["One", "Second", "Third"]
		
		array_list_of_strings.set(1, "Two");
		//array_list_of_strings = ["One", "Two", "Third"]
		
		array_list_of_strings.set(2, "Three");
		//array_list_of_strings = ["One", "Two", "Three"]
		
		System.out.println("array_list_of_strings: " + array_list_of_strings);  
		System.out.println();
		
		for(int i = 0; i < num_items; i++)
		{
			System.out.print("array_list_of_strings.get(" + i + "): ");
			System.out.println(array_list_of_strings.get(i));
		}
	}
}

/*
array_list_of_strings: [First, Second, Third]

array_list_of_strings.get(0): First
array_list_of_strings.get(1): Second
array_list_of_strings.get(2): Third

-------------------------------------------------

array_list_of_strings: [One, Two, Three]

array_list_of_strings.get(0): One
array_list_of_strings.get(1): Two
array_list_of_strings.get(2): Three
*/
