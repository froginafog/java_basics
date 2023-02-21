import java.util.Scanner;  
//import the "Scanner" class from the "java.util" package

public class Main
{
    public static void main(String[] args)  
	{	             
		Scanner scanner_object = new Scanner(System.in);  
		//create an object called "scanner_object" of the "Scanner" class
		
		System.out.print("Enter the name of the game : ");
		String game_name = scanner_object.nextLine();  
		//read a value of the type "String" from the input (keybaord)
		
		System.out.print("Enter the price of the game: ");
		double game_price = scanner_object.nextDouble();  
		//read a value of the type "double" from the input (keybaord)
		
		System.out.print("Enter the number of players: "); 
		int num_players = scanner_object.nextInt();  
		//read a value of the type "int" from the input (keybaord)
		
		System.out.println("game_name  : " + game_name);
		System.out.println("game_price : " + game_price);
		System.out.println("num_players: " + num_players);
	}
}

/*
Enter the name of the game : Game One
Enter the price of the game: 89.98
Enter the number of players: 4
game_name  : Game One
game_price : 89.98
num_players: 4
*/
