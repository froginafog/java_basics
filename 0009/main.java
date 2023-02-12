public class Main
{
    public static void main(String[] args)  
	{
		int month_number;
		String month_string;
		String message;
		
		month_number = 5;
		
		switch(month_number)
		{
			case 1:  //if(month_number == 1)
				month_string = "January";
				message = month_string + " is month number " + month_number;
				break;
			case 2:  //else if(month_number == 2)
				month_string = "February";
				message = month_string + " is month number " + month_number;
				break;
			case 3:  //else if(month_number == 3)
				month_string = "March";
				message = month_string + " is month number " + month_number;
				break;
			case 4:  //else if(month_number == 4)
				month_string = "April";
				message = month_string + " is month number " + month_number;
				break;
			case 5:  //else if(month_number == 5)
				month_string = "May";
				message = month_string + " is month number " + month_number;
				break;
			case 6:  //else if(month_number == 6)
				month_string = "June";
				message = month_string + " is month number " + month_number;
				break;
			case 7:  //else if(month_number == 7)
				month_string = "July";
				message = month_string + " is month number " + month_number;
				break;
			case 8:  //else if(month_number == 8)
				month_string = "August";
				message = month_string + " is month number " + month_number;
				break;
			case 9:  //else if(month_number == 9)
				month_string = "September";
				message = month_string + " is month number " + month_number;
				break;
			case 10:  //else if(month_number == 10)
				month_string = "October";
				message = month_string + " is month number " + month_number;
				break;
			case 11:  //else if(month_number == 11)
				month_string = "November";
				message = month_string + " is month number " + month_number;
				break;
			case 12:  //else if(month_number == 12)
				month_string = "December";
				message = month_string + " is month number " + month_number;
				break;
			default:  //else
				month_string = "Month Not Found";
				message = "Invalid Month Number";
		}
		
		System.out.println("month_string: " + month_string);
		System.out.println("message     : " + message);
	}
}

/*
month_string: May
message     : May is month number 5
*/
