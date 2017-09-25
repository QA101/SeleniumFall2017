package src;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovePlurals {

	public static void main(String[] args) {
		ArrayList<String> MyList = new ArrayList<String>(Arrays.asList("cat", "cats", "dogs", "dog", "mice", "mices"));
		System.out.println(MyList);
		System.out.println(remove(MyList));
	}
	
	public static ArrayList<String> remove(ArrayList<String> MyList){
		int loc = 0;
		for (String current : MyList){
			if(current.endsWith("s")){
				//minus 1 because it is the second to last element in the array list
				//Uses length for the string stored at that location
				MyList.set(loc, MyList.get(loc).substring(0,MyList.get(loc).length()-1));
			}
			loc ++;
		}
		
		return MyList;
	}
}
