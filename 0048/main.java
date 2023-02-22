public class Main
{
    	public static void main(String[] args)  
	{	             
		Player player_object_1 = new Player();  //create an object of the derived class "Player"
		Player player_object_2 = new Player();  //create another object of the derived class "Player"
		
		player_object_1.set_game_name("Game One");
		player_object_1.set_player_name("Player One");
		player_object_2.set_game_name("Game One");
		player_object_2.set_player_name("Player Two");		
		
		//an object of a derived class can access the members of its base class
		 
		System.out.println("player_object_1.get_game_name()   : " + player_object_1.get_game_name());
		System.out.println("player_object_1.get_player_name() : " + player_object_1.get_player_name());
		System.out.println("player_object_2.get_game_name()   : " + player_object_2.get_game_name());
		System.out.println("player_object_2.get_player_name()): " + player_object_2.get_player_name());
	}
}

class Game  //base class (or superclass)
{
	String game_name;  //member of the base class
	
	void set_game_name(String game_name)  //member of the base class
	{
		this.game_name = game_name;
	}
	
	String get_game_name()  //member of the base class
	{
		return game_name;
	}
}

class Player extends Game  //"Player" is a derived class (or subclass) which inherits from the base class "Game"
{
	String player_name;  //member of the derived class
	
	void set_player_name(String player_name)  //member of the derived class
	{
		this.player_name = player_name;
	}
	
	String get_player_name()  //member of the derived class
	{
		return player_name;
	}
}

/*
player_object_1.get_game_name()   : Game One
player_object_1.get_player_name() : Player One
player_object_2.get_game_name()   : Game One
player_object_2.get_player_name()): Player Two
*/
