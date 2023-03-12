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
		String output_file_name = "output_data.txt";
		PrintWriter output_print_writer_object = new PrintWriter(output_file_name);
		
		//copy data from input_data.txt to output_data.txt with formatting
		while(input_scanner_object.hasNext())  //does it have a next string? (blank space and new line mark the end of a string)
		{
			String input_string = input_scanner_object.next();
			output_print_writer_object.print(input_string + " | ");
		}
		
		input_scanner_object.close();  //close the input scanner object
		output_print_writer_object.close();  //close the output print writer object
	}
}


