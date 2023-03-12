import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

class Main
{
	//"throws FileNotFoundException" must be included
	public static void main(String[] args) throws FileNotFoundException  
	{
		String input_file_name = "input_data.txt";
		File input_file_object = new File(input_file_name);
		Scanner input_scanner_object = new Scanner(input_file_object);
		input_scanner_object.useDelimiter("");
		String output_file_name = "output_data.txt";
		PrintWriter output_print_writer_object = new PrintWriter(output_file_name);
		
		//copy data from input_data.txt to output_data.txt with formatting
		//copying one character at a time
		while(input_scanner_object.hasNext())  //does it have a next string? (newline marks the end of a string)
		{
			String input_string = input_scanner_object.next();
			char input_character = input_string.charAt(0);
			if(input_character == ' ')
			{
				output_print_writer_object.print(" | ");
			}
			else if(input_character == '\n')
			{
				output_print_writer_object.println();
			}
			else
			{
				output_print_writer_object.print(input_character);
			}
		}
		
		input_scanner_object.close();  //close the input scanner object
		output_print_writer_object.close();  //close the output print writer object
	}
}


