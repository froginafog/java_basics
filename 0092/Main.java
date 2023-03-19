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
		
		String name_of_player_to_be_removed;
		
		System.out.println("--------------------------------------------");
		
		name_of_player_to_be_removed = "Player Five";
		game_object.remove_player(name_of_player_to_be_removed);
		System.out.println("list of player names:");
		game_object.print_player_names();
		
		System.out.println("--------------------------------------------");
		
		name_of_player_to_be_removed = "Player Four";
		game_object.remove_player(name_of_player_to_be_removed);
		System.out.println("list of player names:");
		game_object.print_player_names();
		
		System.out.println("--------------------------------------------");
		
		name_of_player_to_be_removed = "Player Two";
		game_object.remove_player(name_of_player_to_be_removed);
		System.out.println("list of player names:");
		game_object.print_player_names();
		System.out.println("--------------------------------------------");
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
	
	//Remove player by searching for player name.
	void remove_player(String player_name)
	{
		boolean player_is_found = false;
		int num_players = array_list_of_players.size();
		int i = 0;
		while(i < num_players)
		{
			if(player_name == array_list_of_players.get(i).player_name)
			{
				player_is_found = true;
				array_list_of_players.remove(i);
				num_players = array_list_of_players.size();
			}
			else
			{
				i++;
			}
		}
		
		if(player_is_found == true)
		{
			System.out.println("The player \"" + player_name + "\" is removed.");
		}
		else
		{
			
			System.out.println("The player \"" + player_name + "\" is not found.");
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
--------------------------------------------
The player "Player Five" is not found.
list of player names:
Player One
Player Two
Player Three
Player Four
--------------------------------------------
The player "Player Four" is removed.
list of player names:
Player One
Player Two
Player Three
--------------------------------------------
The player "Player Two" is removed.
list of player names:
Player One
Player Three
--------------------------------------------
*/


