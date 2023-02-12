public class Main
{
    public static void main(String[] args)  
	{
		int a = 10;
		int b = 5;
		int c = 15;
		int larger_number_1;
		int larger_number_2;
		
		larger_number_1 = a > b ? a : b;
		/*
			if(a > b)
			{
				larger_number = a
			}
			else
			{
				larger_number = b
			}
		*/
		
		larger_number_2 = a > c ? a : c;
		/*
			if(a > c)
			{
				larger_number = a
			}
			else
			{
				larger_number = c
			}
		*/
		
		System.out.println("larger_number_1: " + larger_number_1);
		System.out.println("larger_number_2: " + larger_number_2);
	}
}

/*
larger_number_1: 10
larger_number_2: 15
*/
