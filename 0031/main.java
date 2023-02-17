public class Main
{
	//create a method called "print_message"
	//we don't need to create an object to use a "static" method
	//"void" means that the method (or function) does not return a value
	static void print_message() 
	{
		System.out.println("Hello Coder");
	}
	
	static void print_input_message(String input_message)
	{
		System.out.println(input_message);
	}

    	public static void main(String[] args)  
	{
		print_message();
		print_input_message("To code or not to code.");
		print_input_message("To Java or not to Java.");
	}
}

/*
Hello Coder
To code or not to code.
To Java or not to Java.
*/
