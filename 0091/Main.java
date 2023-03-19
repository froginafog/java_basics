import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		Player player_object_1 = new Player();
		Player player_object_2 = new Player();
		
		player_object_1.player_name = "Player One";
		player_object_2.player_name = "Player Two";
	
		Game game_object = new Game();
		
		game_object.add_player(player_object_1);
		game_object.add_player(player_object_2);
		
		String sought_player_name;
		boolean player_is_found;
		
		sought_player_name = "Player One";
		System.out.print("Does \"" + sought_player_name + "\" exist? ");
		player_is_found = game_object.search_player(sought_player_name);
		if(player_is_found == true)
		{
			System.out.print("Yes");
		}
		else
		{
			System.out.println("No");
		}
		System.out.println("\n------------------------------------------------");
		sought_player_name = "Player Two";
		System.out.print("Does \"" + sought_player_name + "\" exist? ");
		player_is_found = game_object.search_player(sought_player_name);
		if(player_is_found == true)
		{
			System.out.print("Yes");
		}
		else
		{
			System.out.println("No");
		}
		System.out.println("\n------------------------------------------------");
		sought_player_name = "Player Three";
		System.out.print("Does \"" + sought_player_name + "\" exist? ");
		player_is_found = game_object.search_player(sought_player_name);
		if(player_is_found == true)
		{
			System.out.print("Yes");
		}
		else
		{
			System.out.print("No");
		}
		System.out.println();
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
	
	//Search for players by player names.
	//Returns true if the sought player name is found in array_list_of_players.
	//Returns false if the sought player name is not found array_list_of_players.
	boolean search_player(String player_name)
	{
		for(Player current_player_object: array_list_of_players)
		{
			if(player_name == current_player_object.player_name)
			{
				return true;
			}
		}
		return false;
	}
}

/*
Does "Player One" exist? Yes
------------------------------------------------
Does "Player Two" exist? Yes
------------------------------------------------
Does "Player Three" exist? No
*/


