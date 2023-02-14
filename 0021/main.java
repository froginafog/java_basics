public class Main
{
    public static void main(String[] args)  
	{
		int num_items = 3;
		int[] array_of_integers = new int[num_items];  
		
		array_of_integers[0] = 10;
		array_of_integers[1] = 20;
		array_of_integers[2] = 30;
		
		for(int current_item: array_of_integers)  
		{
			System.out.println("current_item: " + current_item);
		}
	}
}

/*
current_item: 10
current_item: 20
current_item: 30
*/
