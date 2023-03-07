import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class Main
{
	//"throws FileNotFoundException" must be included
	public static void main(String[] args) throws FileNotFoundException  
	{
		String input_file_name = "input_data.txt";
		File input_file_object = new File(input_file_name);
		Scanner input_scanner_object = new Scanner(input_file_object);
		
		while(input_scanner_object.hasNextLine())
		{
			String input_line_of_string = input_scanner_object.nextLine();
			System.out.println(input_line_of_string);
		}
		
		input_scanner_object.close();  //close the input scanner object 
	}
}

/*
First Line
Second Line
Third Line
Fourth Line
Fifth Line
*/
