public class Main
{
    public static void main(String[] args)  
	{	             
		Game game_object = new Game("Game One");
		
		System.out.println("game_object.game_name         : " + game_object.game_name);
		
		//---------------------------------------------------------------------------------------------------------
		
		Game.Level level_object = game_object.new Level("Level One" + " in " + game_object.game_name);
		
		//System.out.println("level_object.game_name        : " + level_object.game_name);  
		//this line causes an error
		//we cannot use an object of an inner class to access a member of an outer class directly
		
		//System.out.println("game_object.level_name        : " + game_object.level_name);
		//this line causes an error
		//we cannot use an object of an outer class to access a member of an inner class directly
		
		System.out.println("level_object.get_game_name()  : " + level_object.get_game_name());
		
		System.out.println("level_object.level_name       : " + level_object.level_name);
		
		//---------------------------------------------------------------------------------------------------------

		Game.Level.Region region_object = level_object.new Region("Region One" + " in " + level_object.level_name);
		
		System.out.println("region_object.get_level_name(): " + region_object.get_level_name());
		
		System.out.println("region_object.region_name     : " + region_object.region_name);
	}
}

//nested classes
class Game 
{
	String game_name;
	
	Game(String game_name)
	{
		this.game_name = game_name;
	}
	
	class Level 
	{
		String level_name;
		
		Level(String level_name)
		{
			this.level_name = level_name;
		}
		
		String get_game_name()
		{
			return game_name;
		}
		//we can use a method in the inner class to access a member of an outer class

		class Region  
		{
			String region_name;
			
			Region(String region_name)
			{
				this.region_name = region_name;
			}
				
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
