public class Main
{
    	public static void main(String[] args)  
	{	                 
		Game game_object = new Game();
		String player_name;
		
		game_object.push_player_name("Player One");
		System.out.println("Player Names:");
		for(int i = 0; i < game_object.player_names.length; i++)
		{
			System.out.println(game_object.player_names[i]);
		}
		
		System.out.println("--------------------1--------------------");
		
		game_object.push_player_name("Player Two");
		System.out.println("Player Names:");
		for(int i = 0; i < game_object.player_names.length; i++)
		{
			System.out.println(game_object.player_names[i]);
		}
		
		System.out.println("--------------------2--------------------");
		
		game_object.push_player_name("Player Three");
		System.out.println("Player Names:");
		for(int i = 0; i < game_object.player_names.length; i++)
		{
			System.out.println(game_object.player_names[i]);
		}
		
		System.out.println("--------------------3--------------------");
		
		game_object.push_player_name("Player Four");
		System.out.println("Player Names:");
		for(int i = 0; i < game_object.player_names.length; i++)
		{
			System.out.println(game_object.player_names[i]);
		}
		
		System.out.println("--------------------4--------------------");
		
		game_object.push_player_name("Player Five");
		for(int i = 0; i < game_object.player_names.length; i++)
		{
			System.out.println(game_object.player_names[i]);
		}

		System.out.println("--------------------5--------------------");
		
		player_name = game_object.pop_player_name();
		System.out.println("Player Names:");
		for(int i = 0; i < game_object.player_names.length; i++)
		{
			System.out.println(game_object.player_names[i]);
		}
		
		System.out.println("--------------------6--------------------");
		
		player_name = game_object.pop_player_name();
		System.out.println("Player Names:");
		for(int i = 0; i < game_object.player_names.length; i++)
		{
			System.out.println(game_object.player_names[i]);
		}
		
		System.out.println("--------------------7--------------------");
		
		player_name = game_object.pop_player_name();
		System.out.println("Player Names:");
		for(int i = 0; i < game_object.player_names.length; i++)
		{
			System.out.println(game_object.player_names[i]);
		}
		
		System.out.println("--------------------8--------------------");
		
		player_name = game_object.pop_player_name();
		System.out.println("Player Names:");
		for(int i = 0; i < game_object.player_names.length; i++)
		{
			System.out.println(game_object.player_names[i]);
		}
		
		System.out.println("--------------------9--------------------");
		
		player_name = game_object.pop_player_name();
		System.out.println("Player Names:");
		for(int i = 0; i < game_object.player_names.length; i++)
		{
			System.out.println(game_object.player_names[i]);
		}
		
		System.out.println("--------------------10--------------------");
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
	
	//push the player name into the top of the stack
	void push_player_name(String player_name)  
	{
		if(index_for_player_name >= MAX_NUM_PLAYERS - 1)
		{
			System.out.println("array of player_names is full");
		}
		else
		{
			index_for_player_name++;
			player_names[index_for_player_name] = player_name;
			System.out.println("The player \"" + player_names[index_for_player_name] + "\" is added.");
		}
	}
	
	//pop a player name out of the top of the stack
	String pop_player_name()
	{
		if(index_for_player_name >= MAX_NUM_PLAYERS)
		{
			index_for_player_name--;
			return "";
		}	
		else if(index_for_player_name < 0)
		{
			System.out.println("array of player_names is empty");
			return "";
		}
		else
		{
			String player_name = player_names[index_for_player_name];
			player_names[index_for_player_name] = null;
			index_for_player_name--;
			System.out.println("The player \"" + player_name + "\" is removed.");
			return player_name;
		}
	}
}

/*
The player "Player One" is added.
Player Names:
Player One
null
null
null
--------------------1--------------------
The player "Player Two" is added.
Player Names:
Player One
Player Two
null
null
--------------------2--------------------
The player "Player Three" is added.
Player Names:
Player One
Player Two
Player Three
null
--------------------3--------------------
The player "Player Four" is added.
Player Names:
Player One
Player Two
Player Three
Player Four
--------------------4--------------------
array of player_names is full
Player One
Player Two
Player Three
Player Four
--------------------5--------------------
The player "Player Four" is removed.
Player Names:
Player One
Player Two
Player Three
null
--------------------6--------------------
The player "Player Three" is removed.
Player Names:
Player One
Player Two
null
null
--------------------7--------------------
The player "Player Two" is removed.
Player Names:
Player One
null
null
null
--------------------8--------------------
The player "Player One" is removed.
Player Names:
null
null
null
null
--------------------9--------------------
array of player_names is empty
Player Names:
null
null
null
null
--------------------10--------------------
*/
