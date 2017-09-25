package src;

import java.util.ArrayList;
import java.util.Arrays;

public class capitalizePlurals {

	public static void main(String[] args) {
		ArrayList<String> MyList = new ArrayList<String>(Arrays.asList("cat", "cats", "dogs", "dog", "mice", "mices"));
		System.out.println(MyList.toString());
		System.out.println(capitalize(MyList));
	}
	
	public static ArrayList<String> capitalize(ArrayList<String> MyList){
		int loc = 0;
		for (String current : MyList){
			if(current.endsWith("s")){
				MyList.set(loc, MyList.get(loc).toUpperCase());
			}
			loc ++;
		}
		
		return MyList;
	}

}
