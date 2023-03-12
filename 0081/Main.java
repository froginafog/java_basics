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
		
		//write the year values read from the input file to the output file
		while(input_scanner_object.hasNextLine())  //while the next line of string exists
		{
			String input_string = input_scanner_object.nextLine();    //returns a line of string
			if(input_string.isEmpty() == false)  //check if the input_string is empty
			{
				int num_chars_in_input_string = input_string.length();
				for(int i_of_input_string = 0; i_of_input_string < num_chars_in_input_string; i_of_input_string++)
				{
					if(i_of_input_string + 3 < num_chars_in_input_string)
					{
						if(Character.isDigit(input_string.charAt(i_of_input_string))  //check if all 4 consecutive characters are digits
						   && Character.isDigit(input_string.charAt(i_of_input_string + 1))
						   && Character.isDigit(input_string.charAt(i_of_input_string + 2))
						   && Character.isDigit(input_string.charAt(i_of_input_string + 3)))
						{
							output_print_writer_object.print(input_string.charAt(i_of_input_string));
							output_print_writer_object.print(input_string.charAt(i_of_input_string + 1));
							output_print_writer_object.print(input_string.charAt(i_of_input_string + 2));
							output_print_writer_object.print(input_string.charAt(i_of_input_string + 3));
							output_print_writer_object.print(" | ");
						}
						
					}
				}
			}
		}
		
		input_scanner_object.close();  //close the input scanner object
		output_print_writer_object.close();  //close the output print writer object
	}
}


