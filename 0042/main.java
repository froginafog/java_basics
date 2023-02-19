public class Main
{
    	public static void main(String[] args)  
	{	                 
		Game game_object = new Game();
		
		game_object.print_game_info("Game One");
		System.out.println("-------------------------------------------------------");
		game_object.print_game_info(2);
		System.out.println("-------------------------------------------------------");
		game_object.print_game_info("Game Two", 4);		
	}
}

class Game  
{
	//Method Overloading
	//It is the process in which when there are multiple methods with the same name,
	//a method is called based on matching the arguments of the methods with the values 
	//passed to the methods.
	//Overloaded methods are methods with the same name but different number of parameters and/or
	//different types of parameters.
	
	void print_game_info(String game_name)
	{
		System.out.println("Printing only the game name.");
		System.out.println("Game Name: " + game_name);
	}
	
	void print_game_info(int num_players)
	{
		System.out.println("Printing only the number of players.");
		System.out.println("Number of Players: " + num_players);
	}
	
	void print_game_info(String game_name, int num_players)
	{
		System.out.println("Printing both the game name and the number of players.");
		System.out.println("Game Name: " + game_name);
		System.out.println("Number of Players: " + num_players);
	}
}

/*
Printing only the game name.
Game Name: Game One
-------------------------------------------------------
Printing only the number of players.
Number of Players: 2
-------------------------------------------------------
Printing both the game name and the number of players.
Game Name: Game Two
Number of Players: 4
*/
