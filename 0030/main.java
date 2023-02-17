public class Main
{
    	public static void main(String[] args)  
	{
		for(int n = 0; n <= 5; n++)
		{
			if(n == 3)  
			{
				break;  //when "break" is reached, the program leaves the instance of the "for" loop 
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
end of the program
*/
