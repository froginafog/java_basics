public class Main
{
    	public static void main(String[] args)  
	{	
		String[] array_of_player_names_1 = {"Player One In Game One", 
		                                    "Player Two In Game One"};                                  
		String[] array_of_player_names_2 = {"Player One In Game Two",
											"Player Two In Game Two",
											"Player Three In Game Two",
											"Player Four In Game Two"};									
		Game game_object_1 = new Game("Game One", 2, array_of_player_names_1);
		Game game_object_2 = new Game("Game Two", 4, array_of_player_names_2);
							
		
		System.out.println("Game Name        : " + game_object_1.game_name);
		System.out.println("Number of Players: " + game_object_1.num_players);
		System.out.println("Player Names     :");
		for(int i = 0; i < game_object_1.player_names.length; i++)
		{
			if(game_object_1.player_names[i] != null)
			{
				System.out.println(game_object_1.player_names[i]);
			}
		}
		
		System.out.println("-----------------------------------");
		
		System.out.println("Game Name        : " + game_object_2.game_name);
		System.out.println("Number of Players: " + game_object_2.num_players);
		System.out.println("Player Names     :");
		for(int i = 0; i < game_object_2.player_names.length; i++)
		{
			if(game_object_2.player_names[i] != null)
			{
				System.out.println(game_object_2.player_names[i]);
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
	
	public Game(String game_name, int num_players, String[] player_names)  //constructor
	{
		this.game_name = game_name;
		this.num_players = num_players;
		for(int i = 0; i < player_names.length && i < MAX_NUM_PLAYERS; i++)
		{
			this.player_names[i] = player_names[i];
		}
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
