package src;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<String> MyList = new ArrayList<String>(Arrays.asList("you?", "are ", "How ", "World! ", "Hello "));
		System.out.println("Before:");
		System.out.println(MyList.toString());
		System.out.println("After:");
		System.out.print(reverse(MyList).toString());
	}
	
	/**
	 * 
	 * Takes an input ArrayList of strings and reverse the string.
	 * Returns the reversed ArrayList
	 * 
	 * @param MyList
	 * @return
	 */
	public static ArrayList<String> reverse(ArrayList<String> MyList){
		ArrayList<String> temp = new ArrayList<String>();
		int current = MyList.size()-1;
		while (current >= 0){
			temp.add(MyList.get(current));
			//Very important to update
			current--;
		}
		MyList = temp;
		return MyList;
		
	}

}
