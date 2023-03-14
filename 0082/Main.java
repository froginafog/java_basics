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
					if(Character.isDigit(input_string.charAt(i_of_input_string)))  //check if it is a digit
					{
						if(i_of_input_string + 3 < num_chars_in_input_string)  //check if the expected digits forming the year are out of bound
						{
							int i_of_digits = i_of_input_string;
							int digits_count = 0;
							while(Character.isDigit(input_string.charAt(i_of_digits)) == true)
							{
								i_of_digits++;
								digits_count++;
								if(i_of_digits >= num_chars_in_input_string)
								{
									break;
								}
							}
							
							//check if the first digit forming the year is zero	
							if(input_string.charAt(i_of_input_string) != '0')
							{
								//check if the expected count of digits forming the year is 4	
								//check if the digit just before the first digit forming the year not a digit
								if((digits_count == 4) 
								&& (Character.isDigit(input_string.charAt(i_of_input_string - 1)) == false) )
								{
									i_of_digits = i_of_input_string;
									for(digits_count = 0; digits_count < 4; digits_count++)
									{
										output_print_writer_object.print(input_string.charAt(i_of_digits));
										i_of_digits++;
									}
									output_print_writer_object.print(" | ");
									i_of_input_string = i_of_input_string + 3;
								}
							}
						}
					}
				}
			}
		}
		
		input_scanner_object.close();  //close the input scanner object
		output_print_writer_object.close();  //close the output print writer object
	}
}


