public class Main
{
    	public static void main(String[] args)  
	{
		for(int n = 0; n <= 5; n++)
		{
			if(n == 3)  
			{
				continue;  //when "continue" is reached, the program goes to "n++" directly
			}
			System.out.println("n: " + n);  
		}
		System.out.println("end of the program");
	}
}

/*
n: 0
n: 1
n: 2
n: 4
n: 5
end of the program
*/
