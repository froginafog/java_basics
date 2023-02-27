public class Main
{
    	public static void main(String[] args)  
	{	             
		Player player_object = new Player();
		//creating an object of a derived class also invokes the constructor of the base class
		//the constructor of the base class is called first
	}
}

class Game  //base class (or superclass)
{
	Game()
	{
		System.out.println("constructor of the \"Game\" class is called");
	}
	
}

class Player extends Game   
{
	Player()
	{
		System.out.println("constructor of the \"Player\" class is called");
	}
}

/*
constructor of the "Game" class is called
constructor of the "Player" class is called
*/
