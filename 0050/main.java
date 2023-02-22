public class Main
{
    	public static void main(String[] args)  
	{	             
		Player player_object = new Player("Game One", "Player One");
		//creating an object of a derived class also invokes the constructor of the base class
		//the constructor of the base class is called first
		
		System.out.println("player_object.game_name  : " + player_object.game_name);
		System.out.println("player_object.player_name: " + player_object.player_name);
	}
}

class Game  //base class (or superclass)
{
	String game_name;

	Game(String game_name)
	{
		System.out.println("constructor of the \"Game\" class is called");
		this.game_name = game_name;
	}
	
}

class Player extends Game   
{
	String player_name;

	Player(String game_name, String player_name)
	{
		super(game_name);  //call the constructor of the base class (it must be on the first line of this constructor)
		System.out.println("constructor of the \"Player\" class is called");
		this.player_name = player_name;
	}
}

/*
constructor of the "Game" class is called
constructor of the "Player" class is called
player_object.game_name  : Game One
player_object.player_name: Player One
*/
