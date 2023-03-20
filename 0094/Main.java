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
		
		System.out.println("list of player names:");
		game_object.print_player_names();
		
		Player new_player_object_2 = new Player();
		new_player_object_2.player_name = "New Player Two";
		
		Player new_player_object_4 = new Player();
		new_player_object_4.player_name = "New Player Four";
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		game_object.replace_player(player_object_2, new_player_object_2);
		System.out.println("list of player names:");
		game_object.print_player_names();
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		game_object.replace_player(player_object_4, new_player_object_4);
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
	
	//Replace a player object by another player object by matching the player name
	void replace_player(Player player_object, Player new_player_object)
	{
		boolean player_is_replaced = false;
		int num_players = array_list_of_players.size();
		int i = 0;
		
		while(i < num_players)
		{
			if(player_object.player_name == array_list_of_players.get(i).player_name)
			{
				array_list_of_players.set(i, new_player_object);
				player_is_replaced = true;
			}
			i++;
		}
		
		if(player_is_replaced == true)
		{
			System.out.println("The player \"" + player_object.player_name + "\" is replaced with the player \"" + new_player_object.player_name + "\".");
		}
		else
		{
			System.out.println("The player \"" + player_object.player_name  + "\" is not replaced because it is not found.");
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
list of player names:
Player One
Player Two
Player Three
Player Four
-----------------------------------------------------------------------------------
The player "Player Two" is replaced with the player "New Player Two".
list of player names:
Player One
New Player Two
Player Three
Player Four
-----------------------------------------------------------------------------------
The player "Player Four" is replaced with the player "New Player Four".
list of player names:
Player One
New Player Two
Player Three
New Player Four
*/


