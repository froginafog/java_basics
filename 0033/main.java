//only one "public" class is allowed per file
public class Main
{
    	public static void main(String[] args)  
	{
		Game main_object_1 = new Game();
		Game main_object_2 = new Game();
		
		main_object_1.game_name = "Game One";
		main_object_1.num_players = 2;
		main_object_1.player_names[0] = "Player One In Game One";
		main_object_1.player_names[1] = "Player Two In Game One";
		
		main_object_2.game_name = "Game Two";
		main_object_2.num_players = 4;
		main_object_2.player_names[0] = "Player One In Game Two";
		main_object_2.player_names[1] = "Player Two In Game Two";
		main_object_2.player_names[2] = "Player Three In Game Two";
		main_object_2.player_names[3] = "Player Four In Game Two";
		
		System.out.println("main_object_1.game_name      : " + main_object_1.game_name);
		System.out.println("main_object_1.num_players    : " + main_object_1.num_players);
		System.out.println("main_object_1.player_names[0]: " + main_object_1.player_names[0]);
		System.out.println("main_object_1.player_names[1]: " + main_object_1.player_names[1]);
		System.out.println("------------------------------------------------------------");
		System.out.println("main_object_2.game_name      : " + main_object_2.game_name);
		System.out.println("main_object_2.num_players    : " + main_object_2.num_players);
		System.out.println("main_object_2.player_names[0]: " + main_object_2.player_names[0]);
		System.out.println("main_object_2.player_names[1]: " + main_object_2.player_names[1]);
		System.out.println("main_object_2.player_names[2]: " + main_object_2.player_names[2]);
		System.out.println("main_object_2.player_names[3]: " + main_object_2.player_names[3]);
	}
}

//additional classes cannot be defined before the class which contains the "main" method
//additional classes should be defined after the class which contains the "main" method
//define a class called "Game"
class Game  
{
	String game_name;
	int num_players;
	String[] player_names = new String[4];  //maximum number of players is 4
}

/*
main_object_1.game_name      : Game One
main_object_1.num_players    : 2
main_object_1.player_names[0]: Player One In Game One
main_object_1.player_names[1]: Player Two In Game One
------------------------------------------------------------
main_object_2.game_name      : Game Two
main_object_2.num_players    : 4
main_object_2.player_names[0]: Player One In Game Two
main_object_2.player_names[1]: Player Two In Game Two
main_object_2.player_names[2]: Player Three In Game Two
main_object_2.player_names[3]: Player Four In Game Two
*/
