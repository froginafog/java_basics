public class Main
{
    public static void main(String[] args)  
	{
		boolean true_or_false;   //create variable of the type "boolean" which can store a boolean value (true or false)
		char one_character;      //create a variable of the type "char" which can store a character
		byte byte_number;	 //create a variable of the type "byte" which can store an integer number in the range of -128 to 127
		short short_number; 	 //create a variable of the type "short_number" which can store an integer number in the range of -32,768 to 32,767
		int int_number;          //create a variable of the type "int" which can store an integer number in the range of -27,48,143,648 to 2,147,483,647
		long long_number;        //create a variable of the type "long" which can store an integer number number in the range of -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		float float_number;      //create a variable of the type "float" which can store floating point number with up to 6 or 7 digits after the decimal point
		double double_number;    //create a variable of the type "double" which can store floating point number with up to 15 digits after the decimal point                    
		String message;          //create a variable of the type "string" which can store a sequence of characters 
		
		true_or_false = false;
		one_character = 'T';
		byte_number = 123;
		short_number = 12345;
		int_number = 1234567890;
		long_number = 123456789012345678L;
		float_number = 12345.1234567f;
		double_number = 12345.123456789012345;
		message = "To Java or not to Java."; 
		
		System.out.println("true_or_false: " + true_or_false);
		System.out.println("one_character: " + one_character);
		System.out.println("byte_number  : " + byte_number);
		System.out.println("short_number : " + short_number);
		System.out.println("int_number   : " + int_number);
		System.out.println("long_number  : " + long_number);
		System.out.println("float_number : " + float_number);
		System.out.println("double_number: " + double_number);  //some rounding could occur 
		System.out.println("message      : " + message);
	}
}

/*
true_or_false: false
one_character: T
byte_number  : 123
short_number : 12345
int_number   : 1234567890
long_number  : 123456789012345678
float_number : 12345.123
double_number: 12345.123456789011
message      : To Java or not to Java.
*/
