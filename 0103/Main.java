import java.util.ArrayList;

class Main
{
	public static void main(String[] args)
	{
		ArrayList<Integer> array_list = new ArrayList<>();
		array_list.add(10);
		array_list.add(20);
		array_list.add(30);
		array_list.add(40);
		array_list.add(50);
		
		System.out.println("array_list:");
		for(int item: array_list)
		{
			System.out.print(item + "  ");
		}
		
		System.out.println("\n-------------------");
		
		int num_items = array_list.size();
		Integer[] array_of_integers = new Integer[num_items];
		array_list.toArray(array_of_integers);  //convert an array list into an array 
		
		System.out.println("array_of_integers:");
		for(int item: array_of_integers)
		{
			System.out.print(item + "  ");
		}
		
		System.out.println();
	}
}

/*
array_list:
10  20  30  40  50  
-------------------
array_of_integers:
10  20  30  40  50  
*/


