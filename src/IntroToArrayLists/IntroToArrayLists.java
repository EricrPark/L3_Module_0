package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> names = new ArrayList<String>();
		//2. Add five Strings to your list
		names.add("laffyette");
		names.add("mulligan");
		names.add("hamilton");
		names.add("burr");
		names.add("lawrence");
		//3. Print all the Strings using a standard for-loop
		for(int i = names.size()-1; i >= 0; i--) {
			String s = names.get(i);
			if(i%2==0) {
				System.out.println(i + ". " + s);
			}
		}
		System.out.println("\n");
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
