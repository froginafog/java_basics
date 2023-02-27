public class Main
{
	//create a method called "add"
	//we don't need to create an object to use a "static" method
	//"double" means that the method (or function) returns a value of the type double
	static double add(double x1, double x2) 
	{
		return x1 + x2;
	}
	
	static double subtract(double x1, double x2) 
	{
		return x1 - x2;
	}
	
	static double multiply(double x1, double x2) 
	{
		return x1 * x2;
	}
	
	static double divide(double x1, double x2) 
	{
		return x1 / x2;
	}
	
    	public static void main(String[] args)  
	{
		double sum, difference, product, quotient;
		
		sum = add(10.4, 5.2);
		difference = subtract(10.4, 5.2);
		product = multiply(10.4, 5.2);
		quotient = divide(10.4, 5.2);
		
		System.out.println("sum       : " + sum);
		System.out.println("difference: " + difference);
		System.out.println("product   : " + product);
		System.out.println("divide    : " + quotient);
	}
}

/*
sum       : 15.600000000000001
difference: 5.2
product   : 54.080000000000005
divide    : 2.0
*/
