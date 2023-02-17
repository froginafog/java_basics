public class Main
{
    	public static void main(String[] args)  
	{
		int matrix[][] = {
					{11, 12, 13, 14, 15},
					{21, 22, 23, 24, 25},
					{31, 32, 33, 34, 35}
				 }; 
						 
		//print the items of the matrix
		for(int i = 0; i < 3; i++)  //loop through the rows of the matrix
		{
			for(int j = 0; j < 5; j++)  //loop through the items of each row
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		//i is the row index
		//j is the column index
	}
}

/*
11 12 13 14 15 
21 22 23 24 25 
31 32 33 34 35 
*/
