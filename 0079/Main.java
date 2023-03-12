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
		
		while(input_scanner_object.hasNextInt())  //does it have a next integer?
		{
			int input_integer = input_scanner_object.nextInt();
			output_print_writer_object.print(input_integer + " | ");
		}
		
		//the loop is broken if the next input read is not an integer, empty space, or newline
		//the loop is broken if a non-integer numeric value (for example, 1.23) is read
		
		input_scanner_object.close();  //close the input scanner object
		output_print_writer_object.close();  //close the output print writer object
	}
}


