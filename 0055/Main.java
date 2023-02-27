//"abstract" is a type modifier
//"abstract" serves to let subclass methods to override superclass methods
//"abstract" methods can be used to show the overall structure of a set of related classes without going into the details
//If a class contains an abstract method, then the class must also be declared as "abstract".
//An abstract method cannot have an implementation.
//That is, an abstract method cannot have a body (the code enclosed by a pair of braces).

public class Main
{
    	public static void main(String[] args)  
	{	             
		Player player_object = new Player();
		
		player_object.game_name = "Game One";
		player_object.player_name = "Player One";
		player_object.print_welcome_message();
	}
}

abstract class Game
{
	String game_name;
	
	abstract void print_welcome_message();  //this method will not be called
}

class Player extends Game
{
	String player_name;

	void print_welcome_message()  //this method will be called
	{
		System.out.println("Welcome to " + game_name + ", " + player_name + ".");
	}
}

/*
Welcome to Game One, Player One.
*/
