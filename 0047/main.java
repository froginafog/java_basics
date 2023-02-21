public class Main
{
    public static void main(String[] args)  
	{	             
		Player player_object_1 = new Player();  //create an object of the derived class "Player"
		Player player_object_2 = new Player();  //create another object of the derived class "Player"
		
		player_object_1.game_name = "Game One";
		player_object_1.player_name = "Player One";
		player_object_2.game_name = "Game One";
		player_object_2.player_name = "Player Two";		
		
		//an object of a derived class can access the members of its base class
		 
		System.out.println("player_object_1.game_name  : " + player_object_1.game_name);
		System.out.println("player_object_1.player_name: " + player_object_1.player_name);
		System.out.println("player_object_2.game_name  : " + player_object_2.game_name);
		System.out.println("player_object_2.player_name: " + player_object_2.player_name);
		
		Game game_object = new Game();  //create an object of the base class "Game"
		
		//game_object.player = "Player Three";  
		//this line of code causes an error
		//an object of the base class cannot access the members of a derived class
	}
}

class Game  //base class (or superclass)
{
	String game_name;  //member of the base class
}

class Player extends Game  //"Player" is a derived class (or subclass) which inherits from the base class "Game"
{
	String player_name;  //member of the derived class
}

/*
player_object_1.game_name  : Game One
player_object_1.player_name: Player One
player_object_2.game_name  : Game One
player_object_2.player_name: Player Two
*/
