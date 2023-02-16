//only one "public" class is allowed per file
public class Main
{
        public static void main(String[] args)  
	{
		Game game_object_1 = new Game();
		Game game_object_2 = new Game();
		
		game_object_1.game_name = "Game One";
		game_object_1.num_players = 2;
		game_object_1.player_names[0] = "Player One In Game One";
		game_object_1.player_names[1] = "Player Two In Game One";
		
		game_object_2.game_name = "Game Two";
		game_object_2.num_players = 4;
		game_object_2.player_names[0] = "Player One In Game Two";
		game_object_2.player_names[1] = "Player Two In Game Two";
		game_object_2.player_names[2] = "Player Three In Game Two";
		game_object_2.player_names[3] = "Player Four In Game Two";
		
		game_object_1.print_game_info();
		System.out.println("---------------------------------");
		game_object_2.print_game_info();
	}
}

//additional classes cannot be defined before the class which contains the "main" method
//additional classes should be defined after the class which contains the "main" method
//define a class called "Game"
class Game  
{
	String game_name;
	int num_players;
	String[] player_names = new String[4];  //maximum number of players is 4
	
	void print_game_info()
	{
		System.out.println("Game Name: " + game_name);
		System.out.println("Number of Players: " + num_players);
		System.out.println("Player Names:");
		for(int i = 0; i < player_names.length; i++) 
		{
			if(player_names[i] != null)
			{
				System.out.println(player_names[i]);
			}
		}
		//player_names.length is the number of items in player_names array
	}
}

/*
Game Name: Game One
Number of Players: 2
Player Names:
Player One In Game One
Player Two In Game One
---------------------------------
Game Name: Game Two
Number of Players: 4
Player Names:
Player One In Game Two
Player Two In Game Two
Player Three In Game Two
Player Four In Game Two
*/
