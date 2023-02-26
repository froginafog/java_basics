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
		Game game_object = new Game();
		
		game_object.game_name = "Game One";
		
		//game_object.game_id = "Game One ID";  
		//this line results in error because game_id is a private member of the Game class
		
		//we can use a non-private member of the Game class to access a private member of the Game class
		game_object.set_game_id("Game One ID");
		
		System.out.println("game_object.game_name    : " + game_object.game_name);
		System.out.println("game_object.get_game_id(): " + game_object.get_game_id());
	}
}

class Game 
{
	public String game_name;  //can be accessed code of this class or code of other classes
	private String game_id;   //can only be accessed by code of this class
	
	void set_game_id(String game_id)
	{
		this.game_id = game_id;
	}
	
	String get_game_id()
	{
		return game_id;
	}
}

/*
game_object.game_name    : Game One
game_object.get_game_id(): Game One ID
*/
