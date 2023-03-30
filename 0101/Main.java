//array_list_of_integers.iterator() returns an iterator which can be used to access the items of array_list_of_integers sequentially
import java.util.ArrayList;
import java.util.Iterator;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<Integer> array_list_of_integers = new ArrayList<Integer>();
		array_list_of_integers.add(10);
		array_list_of_integers.add(20);
		array_list_of_integers.add(30);
		array_list_of_integers.add(40);
		array_list_of_integers.add(50);
		
		Iterator<Integer> iterator_for_array_list_of_integers = array_list_of_integers.iterator();
		
		while(iterator_for_array_list_of_integers.hasNext() == true)
		{
			int item = iterator_for_array_list_of_integers.next();
			System.out.println("position " + array_list_of_integers.indexOf(item) + " of array_list_of_integers contains the item " + item);
		}
	}
}

/*
position 0 of array_list_of_integers contains the item 10
position 1 of array_list_of_integers contains the item 20
position 2 of array_list_of_integers contains the item 30
position 3 of array_list_of_integers contains the item 40
position 4 of array_list_of_integers contains the item 50
*/


