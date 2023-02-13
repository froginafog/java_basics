public class Main
{
    public static void main(String[] args)  
	{
		int num_items = 3;
		int[] array_of_integers = new int[num_items];  
		
		array_of_integers[0] = 10;
		array_of_integers[1] = 20;
		array_of_integers[2] = 30;
		
		for(int i = 0; i < num_items; i++)
		{
			System.out.println("array_of_integers[" + i + "]: " + array_of_integers[i]);
		}
	}
}

/*
array_of_integers[0]: 10
array_of_integers[1]: 20
array_of_integers[2]: 30
*/
