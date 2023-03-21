//Consider 2 array lists: A and B
//A.removeAll(B) removes the items that are in both A and B from A
//A.removeAll(B) returns true if items are removed
//A.removeAll(B) returns false if no item is removed
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<Integer> array_list_of_integers = new ArrayList<Integer>();
		array_list_of_integers.add(10);
		array_list_of_integers.add(20);
		array_list_of_integers.add(30);
		array_list_of_integers.add(40);
		array_list_of_integers.add(50);
		
		System.out.println("array_list_of_integers: ");
		for(int current_integer: array_list_of_integers)
		{
			System.out.print(current_integer + "  ");
		}
		
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------");
		
		ArrayList<Integer> array_list_of_integers_to_be_removed = new ArrayList<Integer>();
		array_list_of_integers_to_be_removed.add(10);
		array_list_of_integers_to_be_removed.add(30);
		array_list_of_integers_to_be_removed.add(50);
		array_list_of_integers_to_be_removed.add(100);
		array_list_of_integers_to_be_removed.add(200);
		
		System.out.println("array_list_of_integers_to_be_removed: ");
		for(int current_integer: array_list_of_integers_to_be_removed)
		{
			System.out.print(current_integer + "  ");
		}
		
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------");
		
		
		if(array_list_of_integers.removeAll(array_list_of_integers_to_be_removed) == true)
		{
			System.out.println("Items that are in both array_list_of_integers and array_list_of_integers_to_be_removed are removed from array_list_of_integers");
		}
		else
		{
			System.out.println("No items are removed from array_list_of_integers");
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("array_list_of_integers: ");
		for(int current_integer: array_list_of_integers)
		{
			System.out.print(current_integer + "  ");
		}
		
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("array_list_of_integers_to_be_removed: ");
		for(int current_integer: array_list_of_integers_to_be_removed)
		{
			System.out.print(current_integer + "  ");
		}
		
		System.out.println();
	}
}

/*
array_list_of_integers: 
10  20  30  40  50  
-------------------------------------------------------------------------------------------------------------------------------
array_list_of_integers_to_be_removed: 
10  30  50  100  200  
-------------------------------------------------------------------------------------------------------------------------------
Items that are in both array_list_of_integers and array_list_of_integers_to_be_removed are removed from array_list_of_integers
-------------------------------------------------------------------------------------------------------------------------------
array_list_of_integers: 
20  40  
-------------------------------------------------------------------------------------------------------------------------------
array_list_of_integers_to_be_removed: 
10  30  50  100  200  
*/


