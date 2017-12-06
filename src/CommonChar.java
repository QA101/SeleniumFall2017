package src;

import java.util.HashMap;

public class CommonChar {

	public static void main(String[] args) {
		CommonChar cc = new CommonChar();
		System.out.println(cc.common("kindle", "reader").keySet());

	}
	
	public HashMap<Character, Integer> common(String input1, String input2){
		HashMap<Character, Integer> input1Hash = new HashMap<Character, Integer>();
		HashMap<Character, Integer> input2Hash = new HashMap<Character, Integer>();
		
		for(int i = 0; i< input2.length(); i++) {
			input2Hash.put(input2.charAt(i), 1);
		}
		
		for(int i = 0; i<input1.length();i++) {
			if(input2Hash.containsKey(input1.charAt(i))) {
				input1Hash.put(input1.charAt(i), 1);
			}
		}
		
		return input1Hash;
	}

}
