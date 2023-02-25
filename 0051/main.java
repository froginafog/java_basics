public class Main
{
    	public static void main(String[] args)  
	{	             
		Status status_object = new Status("Game One", "Player One", "Alive");
		
		System.out.println("status_object.game_name  : " + status_object.game_name);
		System.out.println("status_object.player_name: " + status_object.player_name);
		System.out.println("status_object.status_name: " + status_object.status_name);
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
		super(game_name);  //calls the constructor of the Game class
		System.out.println("constructor of the \"Player\" class is called");
		this.player_name = player_name;
	}
}

class Status extends Player
{
	String status_name;
	
	Status(String game_name, String player_name, String status_name)
	{
		super(game_name, player_name);  //calls the constructor of the Player
		System.out.println("constructor of the \"Status\" class is called");
		this.status_name = status_name;
	}
}

/*
constructor of the "Game" class is called
constructor of the "Player" class is called
constructor of the "Status" class is called
status_object.game_name  : Game One
status_object.player_name: Player One
status_object.status_name: Alive
*/
