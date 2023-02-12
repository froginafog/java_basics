public class Main
{
    public static void main(String[] args)  
	{
		int a = 10;
		int b = 3;
		int sum;
		int difference;
		int product;
		int quotient;
		int remainder;
		
		sum = a + b;
		difference = a - b;
		product = a * b;
		quotient = a / b;  //only the integral part of the result is retained when dividing two values stored in integer variables
		remainder = a % b; 
		
		//10/3 = 3 + 1/3 -> remainder is 1
		
		System.out.println("sum       : " + sum); 
		System.out.println("difference: " + difference);
		System.out.println("product   : " + product);
		System.out.println("quotient  : " + quotient);  
		System.out.println("remainder : " + remainder);
	}
}

/*
sum       : 13
difference: 7
product   : 30
quotient  : 3
remainder : 1
*/
