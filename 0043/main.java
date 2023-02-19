public class Main
{
    public static void main(String[] args)  
	{	                 
		Game game_object_1 = new Game("Game One");  
		Game game_object_2 = new Game(2);
		Game game_object_3 = new Game("Game Three", 4);
		
		System.out.println("---------------------------------------------------------------");
		
		System.out.println("game_object_1.game_name  : " + game_object_1.game_name);
		System.out.println("game_object_1.num_players: " + game_object_1.num_players);
		System.out.println("---------------------------------------------------------------");
		System.out.println("game_object_2.game_name  : " + game_object_2.game_name);
		System.out.println("game_object_2.num_players: " + game_object_2.num_players);
		System.out.println("---------------------------------------------------------------");
		System.out.println("game_object_3.game_name  : " + game_object_3.game_name);
		System.out.println("game_object_3.num_players: " + game_object_3.num_players);	
	}
}

class Game  
{
	//Constructor Overloading
	//It is the process in which when there are multiple constructors with the same name,
	//a constructor is invoked based on matching the arguments of the constructors with the values 
	//passed to the constructors.
	//Overloaded constructors are constructors with the same name but different number of parameters and/or
	//different types of parameters.
	
	String game_name;  //the default value for game_name is null
	int num_players;   //the default value for num_players is 0
	
	Game(String game_name)
	{
		System.out.println("Constructor with only the game name.");
		this.game_name = game_name;
	}
	
	Game(int num_players)
	{
		System.out.println("Constructor with only the number of players.");
		this.num_players = num_players;
	}
	
	Game(String game_name, int num_players)
	{
		System.out.println("Constructor with both the game name and the number of players.");
		this.game_name = game_name;
		this.num_players = num_players;
	}
}

/*
Constructor with only the game name.
Constructor with only the number of players.
Constructor with both the game name and the number of players.
---------------------------------------------------------------
game_object_1.game_name  : Game One
game_object_1.num_players: 0
---------------------------------------------------------------
game_object_2.game_name  : null
game_object_2.num_players: 2
---------------------------------------------------------------
game_object_3.game_name  : Game Three
game_object_3.num_players: 4
*/
