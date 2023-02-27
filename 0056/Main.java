//An "interface" tells what a class does but not how it does it.
//An "interface" cannot be used as a base class.
//An "interface" is implicitly abstract (we don't have to specify it).
//The methods in an "interface" are implicitly abstract (we don't have to specify them).
//The methods in an "interface" are implicitly public (we don't have to specify them).
//No constructors in an "interface".
//All variables defined in an "interface" are "static" and "final" by default.
//A "static" variable can be accessed by the class name without the need to use an object to access it.
//A "final" variable is a variable whose value cannot be changed.
//If a class implements an "interface", all of the methods in the "interface" must be defined in the class (except if the class is "abstract").
//A class inherits from an "interface".

public class Main
{
   	public static void main(String[] args)  
	{	             
		System.out.println("Message.default_welcome_message: " + Message.default_welcome_message);
		System.out.println("Message.default_goodbye_message: " + Message.default_goodbye_message);
		
		System.out.println("--------------------------------------------------------");
	
		Game game_object = new Game();
		
		game_object.game_name = "Game One";
		game_object.print_welcome_message();
		game_object.print_goodbye_message();
	}
}

interface Message  //"abstract" by default
{
	String default_welcome_message = "Welcome";  
	//it is "static" and "final" by default
	//must be assigned a value
	
	String default_goodbye_message = "Thank you for playing";  
	//it is "static" and "final" by default
	//must be assigned a value
	
	void print_welcome_message();  
	//"public" and "abstract" by default 
	 
	void print_goodbye_message(); 
	//"public" and "abstract" by default  
}

class Game implements Message
{
	String game_name;
	
    	public void print_welcome_message()  
    	{
		System.out.println(default_welcome_message + " to " + game_name);
	}
	//This method must be public because it is part of an "interface".
	
	public void print_goodbye_message()
    	{
		System.out.println(default_goodbye_message + " " + game_name);
	}
	//This method must be public because it is part of an "interface".
}

/*
Message.default_welcome_message: Welcome
Message.default_goodbye_message: Thank you for playing
--------------------------------------------------------
Welcome to Game One
Thank you for playing Game One
*/
