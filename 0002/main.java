//double slashes says that what comes after it on this line is a comment
//a comment is a non-executable text

/*
everything between slash star and star slash is also a comment
*/

//"public class" means that the class is accessible to other classes 
public class Main
{
//"{" marks the beginning of this class

	//define the "main" method
    public static void main(String[] args)  //this line must exist for every java program
	{
		//"{" marks the beginning of this method 
		
		//"main" is a method of the class "Main"
		//"public" means that the method is accessible to other classes
		//for now, we view "static" as a keyword which must be there for the "main" method 
		//"void" means that the method does not return a value
		//"void" must be there when we declare the "main" method	
		//"String[] args" is a list of parameters for passing values to the "main" method
		
		System.out.print("Java");
		System.out.print(" is about object-oriented programming.");
		System.out.println();  //go to the next line
		System.out.println("We just moved to a new line.");
		//"System.out" is an object
		//"print" is a method that belongs to the object "System.out"
		//"print" displays a text passed to its argument to the console (without going to the next line)
		//";" marks the end of a code statement
		
		//"}" marks the end of the method 
	}
	
//"}" marks the end of this class
}

/*
Java is about object-oriented programming.
We just moved to a new line.
*/
