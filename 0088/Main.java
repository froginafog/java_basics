import java.util.ArrayList;
//an ArrayList is an array which can be resized

class Main
{
	public static void main(String[] args)
	{
		Game game_object_1 = new Game();
		game_object_1.game_name = "Game One";
		game_object_1.num_players = 2;
		
		Game game_object_2 = new Game();
		game_object_2.game_name = "Game Two";
		game_object_2.num_players = 4;
		
		ArrayList<Game> array_list_of_objects = new ArrayList<Game>();
		
		array_list_of_objects.add(game_object_1);
		array_list_of_objects.add(game_object_2);
		
		for(Game game_object: array_list_of_objects)
		{
			game_object.print_info();
			System.out.println("------------------------------");
		}
	}
}

class Game
{
	String game_name;
	int num_players;
	
	void print_info()
	{
		System.out.println("Game Name        : " + game_name);
		System.out.println("Number of Players: " + num_players); 
	}
}

/*
Game Name        : Game One
Number of Players: 2
------------------------------
Game Name        : Game Two
Number of Players: 4
------------------------------
*/
