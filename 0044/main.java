public class Main
{
    public static void main(String[] args)  
	{	                 
		Game game_object_1 = new Game("Game One", 4);
		Game game_object_2 = new Game("Game Two", 4);
		Game test_object = new Game();
		
		if(test_object.is_same_game_name(game_object_1, game_object_2) == true)
		{
			System.out.println("game_object_1 and game_object_2 contain the same game name");
		}
		else
		{
			System.out.println("game_object_1 and game_object_2 do not contain the same game name");
		}
		
		if(test_object.is_same_number_of_players(game_object_1, game_object_2) == true)
		{
			System.out.println("game_object_1 and game_object_2 contain the same number of players");
		}
		else
		{
			System.out.println("game_object_1 and game_object_2 do not contain the same number of players");
		}
	}
}

class Game  
{
	String game_name;  
	int num_players;
	
	Game()
	{
		//empty
	}
	
	Game(String game_name, int num_players)
	{
		this.game_name = game_name;
		this.num_players = num_players;
	}
	
	//passing objects to the method
	boolean is_same_game_name(Game object_1, Game object_2)
	{
		if(object_1.game_name == object_2.game_name)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//passing objects to the method
	boolean is_same_number_of_players(Game object_1, Game object_2)
	{
		if(object_1.num_players == object_2.num_players)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

/*
game_object_1 and game_object_2 do not contain the same game name
game_object_1 and game_object_2 contain the same number of players
*/
