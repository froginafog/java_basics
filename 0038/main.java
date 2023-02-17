public class Main
{
	String game_name;
	
	public Main(String game_name)  //constructor
	{
		System.out.println("A constructor for the class called \"Main\" is called.");
		this.game_name = game_name;
	}
	//a constructor is called whenever an object of the class is created

    	public static void main(String[] args)  
	{
		Main main_object_1 = new Main("Game One");
		Main main_object_2 = new Main("Game Two");
		
		System.out.println("main_object_1.game_name: " + main_object_1.game_name);
		System.out.println("main_object_2.game_name: " + main_object_2.game_name);
	}
}

/*
A constructor for the class called "Main" is called.
A constructor for the class called "Main" is called.
main_object_1.game_name: Game One
main_object_2.game_name: Game Two
*/
