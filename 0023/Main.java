public class Main
{
    	public static void main(String[] args)  
	{
		int num_rows = 3;
		int num_columns = 5;
		int[][] matrix = new int[num_rows][num_columns];  //default values are zeroes
		
		for(int i = 0; i < num_rows; i++)  //loop through the rows of the matrix
		{
			for(int j = 0; j < num_columns; j++)  //loop through the items of each row
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("------------------");
		
		matrix[0][0] = 11;  matrix[0][1] = 12;  matrix[0][2] = 13;  matrix[0][3] = 14;  matrix[0][4] = 15;  
		matrix[1][0] = 21;  matrix[1][1] = 22;  matrix[1][2] = 23;  matrix[1][3] = 24;  matrix[1][4] = 25;  
		matrix[2][0] = 31;  matrix[2][1] = 32;  matrix[2][2] = 33;  matrix[2][3] = 34;  matrix[2][4] = 35;  
						 
		for(int i = 0; i < num_rows; i++)  //loop through the rows of the matrix
		{
			for(int j = 0; j < num_columns; j++)  //loop through the items of each row
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}

/*
0 0 0 0 0 
0 0 0 0 0 
0 0 0 0 0 
------------------
11 12 13 14 15 
21 22 23 24 25 
31 32 33 34 35 
*/
