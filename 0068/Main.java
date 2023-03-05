public class Main
{
    public static void main(String[] args)  
	{	             
		Game game_object = new Game();
		Game.Level level_object = game_object.new Level();
		Game.Level.Region region_object = level_object.new Region();
		
		game_object.game_name = "Game One";
		System.out.println("game_object.game_name         : " + game_object.game_name); 

		System.out.println("level_object.get_game_name()  : " + level_object.get_game_name());
		
		level_object.level_name = "Level One" + " in " + level_object.get_game_name();
		System.out.println("level_object.level_name       : " + level_object.level_name);
		
		System.out.println("region_object.get_level_name(): " + region_object.get_level_name());
		
		region_object.region_name = "Region One" + " in " + region_object.get_level_name();
		System.out.println("region_object.region_name     : " + region_object.region_name);
	}
}

//nested classes
class Game 
{
	String game_name;
	
	class Level 
	{
		String level_name;
		
		String get_game_name()
		{
			return game_name;
		}
		//we can use a method in the inner class to access a member of an outer class

		class Region  
		{
			String region_name;
				
			String get_level_name()
			{
				return level_name;
			}
			//we can use a method in the inner class to access a member of an outer class
		}
	}
}

/*
game_object.game_name         : Game One
level_object.get_game_name()  : Game One
level_object.level_name       : Level One in Game One
region_object.get_level_name(): Level One in Game One
region_object.region_name     : Region One in Level One in Game One
*/
