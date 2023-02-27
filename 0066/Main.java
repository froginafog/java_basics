public class Main
{
    public static void main(String[] args)  
	{	             
		Game game_object = new Game();
		Game.Level level_object = game_object.new Level();
		
		game_object.game_name = "Game One";
		
		//game_object.level_name = "Level One";
		//this line of code results in error
		
		//level_object.game_name = "Game One";
		//this line of code results in error
		
		level_object.level_name = "Level One in Game One";
		
		System.out.println("game_object.game_name  : " + game_object.game_name);
		System.out.println("level_object.level_name: " + level_object.level_name);
	}
}

//nested classes
class Game  //outer class
{
	String game_name;
	
	class Level  //inner class
	{
		String level_name;
	}
	//If we define this class a "private" (private class Level)
	//then the class cannot be accessed by objects outside of this class.
}

/*
game_object.game_name  : Game One
level_object.level_name: Level One in Game One
*/
