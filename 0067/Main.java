public class Main
{
    public static void main(String[] args)  
	{	             
		Game game_object = new Game();
		Game.Level level_object = game_object.new Level();
		
		game_object.game_name = "Game One";
		System.out.println("level_object.get_game_name(): " + level_object.get_game_name());
		
		level_object.level_name = "Level One";
		System.out.println("level_object.level_name     : " + level_object.level_name);
	}
}

//nested classes
class Game  //outer class
{
	String game_name;
	
	class Level  //inner class
	{
		String level_name;
		
		String get_game_name()
		{
			return game_name;
		}
		//we can use a method in the inner class to access a member of the outer class
	}

}

/*
level_object.get_game_name(): Game One
level_object.level_name     : Level One
*/
