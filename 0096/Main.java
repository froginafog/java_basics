import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		String[][] matrix_A = {{"A11", "A12"},
							   {"A21", "A22"},
							   {"A31", "A32"}};
		String[][] matrix_B = {{"B11", "B12"},
							   {"B21", "B22"},
							   {"B31", "B32"}};
	
		ArrayList<String[][]> array_list_of_matrices = new ArrayList<String[][]>();
		
		array_list_of_matrices.add(matrix_A);
		array_list_of_matrices.add(matrix_B);
		
		System.out.println("-------------");
		for(String[][] current_matrix: array_list_of_matrices)
		{	
			for(String[] current_row: current_matrix)
			{
				System.out.print("| ");
				for(String current_item: current_row)
				{
					System.out.print(current_item + " | ");
				}
				System.out.println();
			}
			System.out.println("-------------");
		}
	}
}

/*
-------------
| A11 | A12 | 
| A21 | A22 | 
| A31 | A32 | 
-------------
| B11 | B12 | 
| B21 | B22 | 
| B31 | B32 | 
-------------
*/


