public class Main
{
    	public static void main(String[] args)  
	{	
		String[] array_of_player_names = {"Player One", 
		                                  "Player Two",
		                                  "Player Three",
		                                  "Player Four"};                                  
		
		Game game_object = new Game();
		
		game_object.add_player_name("Player One");
		for(int i = 0; i < game_object.player_names.length; i++)
		{
			System.out.println(game_object.player_names[i]);
		}
		
		System.out.println("--------------1--------------");
		
		game_object.add_player_name("Player Two");
		for(int i = 0; i < game_object.player_names.length; i++)
		{
			System.out.println(game_object.player_names[i]);
		}
		
		System.out.println("--------------2--------------");
		
		game_object.add_player_name("Player Three");
		for(int i = 0; i < game_object.player_names.length; i++)
		{
			System.out.println(game_object.player_names[i]);
		}
		
		System.out.println("--------------3--------------");
		
		game_object.add_player_name("Player Four");
		for(int i = 0; i < game_object.player_names.length; i++)
		{
			System.out.println(game_object.player_names[i]);
		}
		
		System.out.println("--------------4--------------");
		
		game_object.add_player_name("Player Five");

		System.out.println("--------------5--------------");
	}
}

class Game  
{
	int MAX_NUM_PLAYERS = 4;
	String[] player_names = new String[MAX_NUM_PLAYERS]; 
	int index_for_player_name;
	
	Game()
	{
		index_for_player_name = -1;
	}
	
	void add_player_name(String player_name)
	{
		if(index_for_player_name >= MAX_NUM_PLAYERS - 1)
		{
			System.out.println("array of player_names is full");
		}
		else
		{
			index_for_player_name++;
			player_names[index_for_player_name] = player_name;
		}
	}
}

/*
Player One
null
null
null
--------------1--------------
Player One
Player Two
null
null
--------------2--------------
Player One
Player Two
Player Three
null
--------------3--------------
Player One
Player Two
Player Three
Player Four
--------------4--------------
array of player_names is full
--------------5--------------
*/
