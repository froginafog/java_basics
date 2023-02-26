//"public", "protected", "private" are access specifiers
//In order of decreasing accessiblility: public > protected > default > private
//The default access specifier means no access specifier.
//A subclass of a class C is a class which is dervied from class C.

/*
Table of Accessibility:
----------------------------------------------------------------------------
|                                 | public | protected | default | private |
----------------------------------------------------------------------------
|same class                       |    YES |       YES |     YES |     YES |
----------------------------------------------------------------------------
|subclass of the same package     |    YES |       YES |     YES |      NO |    
----------------------------------------------------------------------------
|non-subclass of the same package |    YES |       YES |     YES |      NO |
----------------------------------------------------------------------------
|subclass of another package      |    YES |       YES |      NO |      NO | 
----------------------------------------------------------------------------
|non-subclass of another package  |    YES |        NO |      NO |      NO |
----------------------------------------------------------------------------
*/

//For classes of the same package, the accessibilities are the same for subclass or non-subclass.
//The "main" function has a "public" specifier because it is called by code outside of its class (by the Java run-time system).
//The access specifier "protected" is only used when inheritance and other packages are involved.

public class Main
{
    public static void main(String[] args)  
	{	             
		Player player_object = new Player();
		
		player_object.game_name = "Game One";
		player_object.player_name = "Player One";
		
		System.out.println("player_object.game_name  : " + player_object.game_name); 
		System.out.println("player_object.player_name: " + player_object.player_name);
		
		System.out.println("----------------------------------------");
		
		//player_object.game_id = "G1";  
		//this line results in error because game_id is "private"
		
		//player_object.player_id = "P1";
		//this line results in error because player_id is "private"
		
		player_object.set_game_id("G1");
		player_object.set_player_id("P1");
		
		System.out.println("player_object.get_game_id()  : " + player_object.get_game_id());
		System.out.println("player_object.get_player_id(): " + player_object.get_player_id());
	}
}

class Game 
{
	public String game_name;  //can be accessed by code of this class and code of other classes
	private String game_id;  //can only be accessed by code of this class
	
	void set_game_id(String game_id)
	{
		this.game_id = game_id;
	}
	
	String get_game_id()
	{
		return game_id;
	}
}

class Player extends Game
{
	public String player_name;  //can be accessed by code of this class and code of other classes
	private String player_id;   //can only be accessed by code of this class
	
	void set_player_id(String player_id)
	{
		this.player_id = player_id;
	}
	
	String get_player_id()
	{
		return player_id;
	}
}

/*
player_object.game_name  : Game One
player_object.player_name: Player One
----------------------------------------
player_object.get_game_id()  : G1
player_object.get_player_id(): P1
*/
