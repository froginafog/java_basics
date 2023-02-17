public class Main
{
        public static void main(String[] args)  
	{
		Game game_object_1 = new Game();
		Game game_object_2 = new Game();
		String[] array_of_player_names_1 = {"Player One In Game One", 
		                                    "Player Two In Game One"};                                  
		String[] array_of_player_names_2 = {"Player One In Game Two",
						    "Player Two In Game Two",
						    "Player Three In Game Two",
						    "Player Four In Game Two"};								
		String[] array_of_player_names;
		
		game_object_1.set_game_name("Game One");
		game_object_1.set_num_players(2);
		game_object_1.set_player_names(array_of_player_names_1);
	
		game_object_2.set_game_name("Game Two");
		game_object_2.set_num_players(4);
		game_object_2.set_player_names(array_of_player_names_2);
		
		System.out.println("Game Name        : " + game_object_1.get_game_name());
		System.out.println("Number of Players: " + game_object_1.get_num_players());
		array_of_player_names = game_object_1.get_player_names();
		System.out.println("Player Names     :");
		for(int i = 0; i < array_of_player_names.length; i++)
		{
			if(array_of_player_names[i] != null)
			{
				System.out.println(array_of_player_names[i]);
			}
		}
		
		System.out.println("-----------------------------------");
		
		System.out.println("Game Name        : " + game_object_2.get_game_name());
		System.out.println("Number of Players: " + game_object_2.get_num_players());
		array_of_player_names = game_object_2.get_player_names();
		System.out.println("Player Names     :");
		for(int i = 0; i < array_of_player_names.length; i++)
		{
			if(array_of_player_names[i] != null)
			{
				System.out.println(array_of_player_names[i]);
			}
		}
	}
}

class Game  
{
	int MAX_NUM_PLAYERS = 4;
	String game_name;
	int num_players;
	String[] player_names = new String[MAX_NUM_PLAYERS]; 
	
	void set_game_name(String game_name)
	{
		this.game_name = game_name;  
		//this.game_name on the left hand side is the game_name of the class
		//game_name on the right hand side is the game_name of the argument of the function
	}
	
	String get_game_name()
	{
		return game_name;
	}
	
	void set_num_players(int num_players)
	{
		this.num_players = num_players;
	}
	
	int get_num_players()
	{
		return num_players;
	}
	
	void set_player_names(String[] player_names)
	{
		int num_items = player_names.length;
		for(int i = 0; i < num_items && i < MAX_NUM_PLAYERS; i++)
		{
			this.player_names[i] = player_names[i];
		}
	}
	
	String[] get_player_names()
	{
		return player_names;
	}
}

/*
Game Name        : Game One
Number of Players: 2
Player Names     :
Player One In Game One
Player Two In Game One
-----------------------------------
Game Name        : Game Two
Number of Players: 4
Player Names     :
Player One In Game Two
Player Two In Game Two
Player Three In Game Two
Player Four In Game Two
*/
