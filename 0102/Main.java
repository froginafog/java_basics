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
		
		Object[] array_of_objects;
		array_of_objects = array_list.toArray(); //convert an array list into an array of objects
		
		System.out.println("array_of_objects:");
		for(Object item: array_of_objects)
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
array_of_objects:
10  20  30  40  50  
*/


