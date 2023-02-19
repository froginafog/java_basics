public class Main
{
    public static void main(String[] args)  
	{	                 
		Game game_object = new Game("Game One");
		Game new_game_object = new Game();
		
		new_game_object.modify(game_object, "New Game");
		System.out.println("game_object.game_name    : " + game_object.game_name);
		System.out.println("new_game_object.game_name: " + new_game_object.game_name);
	}
}

class Game  
{
	String game_name;  
	
	Game()
	{
		//empty
	}
	
	Game(String game_name)
	{
		this.game_name = game_name;
	}
	
	Game modify(Game game_object, String game_name)
	{
		this.game_name = game_name;
		return this;  //return the invoking object
	}
}

/*
game_object.game_name    : Game One
new_game_object.game_name: New Game
*/
