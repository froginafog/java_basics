import java.util.ArrayList;

class Main
{
	public static void main(String[] args)
	{
		ArrayList<Integer> array_list_of_integers_1 = new ArrayList<Integer>();
		array_list_of_integers_1.add(10);
		array_list_of_integers_1.add(20);
		array_list_of_integers_1.add(30);
		
		ArrayList<Integer> array_list_of_integers_2 = new ArrayList<Integer>();
		array_list_of_integers_2.add(40);
		array_list_of_integers_2.add(50);
		array_list_of_integers_2.add(60);
		
		System.out.println("array_list_of_integers_1:");
		for(int current_integer: array_list_of_integers_1)
		{
			System.out.print(current_integer + "  ");
		}
		
		System.out.println("\n-----------------------------");
		
		System.out.println("array_list_of_integers_2:");
		
		for(int current_integer: array_list_of_integers_2)
		{
			System.out.print(current_integer + "  ");
		}
		
		System.out.println("\n=============================");
		 
		array_list_of_integers_1.addAll(array_list_of_integers_2);
		//add array_list_of_integers_2 to the end of array_list_of_integers_1
		
		System.out.println("array_list_of_integers_1:");
		for(int current_integer: array_list_of_integers_1)
		{
			System.out.print(current_integer + "  ");
		}
		
		System.out.println("\n-----------------------------");
		
		System.out.println("array_list_of_integers_2:");
		
		for(int current_integer: array_list_of_integers_2)
		{
			System.out.print(current_integer + "  ");
		}
		
		System.out.println();
	}
}

/*
array_list_of_integers_1:
10  20  30  
-----------------------------
array_list_of_integers_2:
40  50  60  
=============================
array_list_of_integers_1:
10  20  30  40  50  60  
-----------------------------
array_list_of_integers_2:
40  50  60  
*/
