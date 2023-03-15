import java.util.ArrayList;
//an ArrayList is an array which can be resized

class Main
{
	public static void main(String[] args)
	{
		ArrayList<String> array_list_of_strings = new ArrayList<String>();
		
		array_list_of_strings.add("Ten");
		array_list_of_strings.add("Twenty");
		array_list_of_strings.add("Thirty");
		
		System.out.println("array_list_of_strings:");
		for(String s: array_list_of_strings)
		{
			System.out.println(s);
		}
		
		System.out.println("--------------------------");
		
		ArrayList<Integer> array_list_of_integers = new ArrayList<Integer>();
		
		array_list_of_integers.add(10);
		array_list_of_integers.add(20);
		array_list_of_integers.add(30);
		
		System.out.println("array_list_of_integers:");
		for(int n: array_list_of_integers)
		{
			System.out.println(n);
		}
		
		System.out.println("--------------------------");
		
		ArrayList<Double> array_list_of_doubles = new ArrayList<Double>();
		
		array_list_of_doubles.add(10.1);
		array_list_of_doubles.add(20.2);
		array_list_of_doubles.add(30.3);
		
		System.out.println("array_list_of_doubles:");
		for(double x: array_list_of_doubles)
		{
			System.out.println(x);
		}
		
		System.out.println("--------------------------");
		
		ArrayList<Character> array_list_of_characters = new ArrayList<Character>(); 
		
		array_list_of_characters.add('T');
		array_list_of_characters.add('F');
		
		System.out.println("array_list_of_characters:");
		for(char ch: array_list_of_characters)
		{
			System.out.println(ch);
		}
		
		System.out.println("--------------------------");
		
		ArrayList<Boolean> array_list_of_booleans = new ArrayList<Boolean>(); 
		
		array_list_of_booleans.add(true);
		array_list_of_booleans.add(false);
		
		System.out.println("array_list_of_booleans:");
		for(boolean true_or_false: array_list_of_booleans)
		{
			System.out.println(true_or_false);
		}
	}
}

/*
array_list_of_strings:
Ten
Twenty
Thirty
--------------------------
array_list_of_integers:
10
20
30
--------------------------
array_list_of_doubles:
10.1
20.2
30.3
--------------------------
array_list_of_characters:
T
F
--------------------------
array_list_of_booleans:
true
false
*/
