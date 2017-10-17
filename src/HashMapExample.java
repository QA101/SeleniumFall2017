package src;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Dog", 123);
		map.put("Cat", 123);
		map.put("Giraffe", 123);
		map.put("Griffin", 123);
		map.put("Minitaur", 123);
		map.put("Dog", 321);
		//map.replace("Dog", 321);
		//map.remove("Dog", 123);
		//map.remove("Dog");

		System.out.println(map.toString());
	}

}
