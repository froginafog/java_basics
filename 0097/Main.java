import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		MyArray my_array_of_integers_object = new MyArray();
		my_array_of_integers_object.create_array(5, "int");
		
		my_array_of_integers_object.array_of_integers[0] = 10;
		my_array_of_integers_object.array_of_integers[1] = 20;
		my_array_of_integers_object.array_of_integers[2] = 30;
		my_array_of_integers_object.array_of_integers[3] = 40;
		my_array_of_integers_object.array_of_integers[4] = 50;
		
		MyArray my_array_of_doubles_object = new MyArray();
		my_array_of_doubles_object.create_array(5, "double");
		
		my_array_of_doubles_object.array_of_doubles[0] = 10.1;
		my_array_of_doubles_object.array_of_doubles[1] = 20.2;
		my_array_of_doubles_object.array_of_doubles[2] = 30.3;
		my_array_of_doubles_object.array_of_doubles[3] = 40.4;
		my_array_of_doubles_object.array_of_doubles[4] = 50.5;
		
		MyArray my_array_of_strings_object = new MyArray();
		my_array_of_strings_object.create_array(3, "String");
		
		my_array_of_strings_object.array_of_strings[0] = "First String";
		my_array_of_strings_object.array_of_strings[1] = "Second String";
		my_array_of_strings_object.array_of_strings[2] = "Third String";
		
		ArrayList<MyArray> array_list_of_array_objects = new ArrayList<MyArray>();
		
		array_list_of_array_objects.add(my_array_of_integers_object);
		array_list_of_array_objects.add(my_array_of_doubles_object);
		array_list_of_array_objects.add(my_array_of_strings_object);
		
		for(MyArray current_array_object: array_list_of_array_objects)
		{
			if(current_array_object.array_of_integers instanceof int[])
			{
				System.out.println("current_array_object.array_of_integers:");
				for(int current_integer: current_array_object.array_of_integers)
				{
					System.out.println(current_integer);
				}
			}
			else if(current_array_object.array_of_doubles instanceof double[])
			{
				System.out.println("current_array_object.array_of_doubles:");
				for(double current_double: current_array_object.array_of_doubles)
				{
					System.out.println(current_double);
				}
			}
			else if(current_array_object.array_of_strings instanceof String[])
			{
				System.out.println("current_array_object.array_of_strings:");
				for(String current_string: current_array_object.array_of_strings)
				{
					System.out.println(current_string);
				}
			}
			else
			{
				System.out.println("The type of value contained in current_array_object is not found.");
			}
			System.out.println("----------------------------------------");
		}
	}
}

class MyArray
{
	int[] array_of_integers;
	double[] array_of_doubles;
	String[] array_of_strings;
	
	void create_array(int num_items, String array_type)
	{
		if(array_type == "int")
		{
			array_of_integers = new int[num_items];
		}
		else if(array_type == "double")
		{
			array_of_doubles = new double[num_items];
		}
		else if(array_type == "String")
		{
			array_of_strings = new String[num_items];
		}
		else
		{
			System.out.println("array type is not recognized");
		}
	}
}

/*
current_array_object.array_of_integers:
10
20
30
40
50
----------------------------------------
current_array_object.array_of_doubles:
10.1
20.2
30.3
40.4
50.5
----------------------------------------
current_array_object.array_of_strings:
First String
Second String
Third String
----------------------------------------
*/


