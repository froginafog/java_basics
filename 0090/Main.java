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
		
		game_object.game_name = "Game One";
		game_object.add_player(player_object_1);
		game_object.add_player(player_object_2);
		
		System.out.println("game_object.game_name: " + game_object.game_name);
		for(Player current_player_object: game_object.array_list_of_players)
		{
			System.out.println("current_player_object.player_name: " + current_player_object.player_name);
		}
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
}

/*
game_object.game_name: Game One
current_player_object.player_name: Player One
current_player_object.player_name: Player Two
*/


