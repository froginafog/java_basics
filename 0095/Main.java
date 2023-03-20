import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		int[] array_1 = {10, 20, 30};
		int[] array_2 = {40, 50, 60};
	
		ArrayList<int[]> array_list_of_arrays = new ArrayList<int[]>();
		
		array_list_of_arrays.add(array_1);
		array_list_of_arrays.add(array_2);
		
		System.out.println("----------------");
		for(int[] current_array: array_list_of_arrays)
		{	
			System.out.print("| ");
			for(int current_item: current_array)
			{
				System.out.print(current_item + " | ");
			}
			System.out.println("\n----------------");
		}
	}
}

/*
----------------
| 10 | 20 | 30 | 
----------------
| 40 | 50 | 60 | 
----------------
*/


