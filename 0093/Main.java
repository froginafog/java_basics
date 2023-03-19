import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		Player player_object_1 = new Player();
		Player player_object_2 = new Player();
		Player player_object_3 = new Player();
		Player player_object_4 = new Player();
		
		player_object_1.player_name = "Player One";
		player_object_2.player_name = "Player Two";
		player_object_3.player_name = "Player Three";
		player_object_4.player_name = "Player Four";
	
		Game game_object = new Game();
		
		game_object.add_player(player_object_1);
		game_object.add_player(player_object_2);
		game_object.add_player(player_object_3);
		game_object.add_player(player_object_4);
		
		game_object.print_player_names();
		
		String name_of_player_to_be_replaced;
		String new_player_name;
		
		System.out.println("----------------------------------------------------------------------------------------");
		
		name_of_player_to_be_replaced = "Player Two";
		new_player_name = "New Player Two";
		game_object.replace_player_name(name_of_player_to_be_replaced, new_player_name);
		System.out.println("list of player names:");
		game_object.print_player_names();
		
		System.out.println("----------------------------------------------------------------------------------------");
		
		name_of_player_to_be_replaced = "Player Four";
		new_player_name = "New Player Four";
		game_object.replace_player_name(name_of_player_to_be_replaced, new_player_name);
		System.out.println("list of player names:");
		game_object.print_player_names();
		
		System.out.println("----------------------------------------------------------------------------------------");
		
		name_of_player_to_be_replaced = "Player Five";
		new_player_name = "New Player Five";
		game_object.replace_player_name(name_of_player_to_be_replaced, new_player_name);
		System.out.println("list of player names:");
		game_object.print_player_names();
	}
}

class Player
{
	String player_name;
}

class Game
{
	String game_name;
	ArrayList<Player> array_list_of_players;
	
	Game()
	{
		array_list_of_players = new ArrayList<Player>();
	}
	
	void add_player(Player player_object)
	{
		array_list_of_players.add(player_object);
	}
	
	//Replace a player name with a new player name
	void replace_player_name(String player_name, String new_player_name)
	{
		boolean player_name_is_replaced = false;
		int num_players = array_list_of_players.size();
		int i = 0;
		
		while(i < num_players)
		{
			if(player_name == array_list_of_players.get(i).player_name)
			{
				array_list_of_players.get(i).player_name = new_player_name;
				player_name_is_replaced = true;
			}
			i++;
		}
		
		if(player_name_is_replaced == true)
		{
			System.out.println("The player name \"" + player_name + "\" is replaced with the player name \"" + new_player_name + "\".");
		}
		else
		{
			System.out.println("The player name \"" + player_name + "\" is not replaced because it is not found.");
		}
	}
	
	void print_player_names()
	{
		for(Player current_player_object: array_list_of_players)
		{
			System.out.println(current_player_object.player_name);
		}
	}
}

/*
Player One
Player Two
Player Three
Player Four
----------------------------------------------------------------------------------------
The player name "Player Two" is replaced with the player name "New Player Two".
list of player names:
Player One
New Player Two
Player Three
Player Four
----------------------------------------------------------------------------------------
The player name "Player Four" is replaced with the player name "New Player Four".
list of player names:
Player One
New Player Two
Player Three
New Player Four
----------------------------------------------------------------------------------------
The player name "Player Five" is not replaced because it is not found.
list of player names:
Player One
New Player Two
Player Three
New Player Four
*/


