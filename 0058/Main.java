public class Main
{
    	public static void main(String[] args)  
	{	             
		Game.game_price = 89.99;
		System.out.println("Game.game_price: " + Game.game_price);
	}
}


class Game 
{
	static double game_price;
	//"static" variable can be accessed without an object
	//"static" variable can be accessed by using the class name
}

/*
Game.game_price: 89.99
*/
