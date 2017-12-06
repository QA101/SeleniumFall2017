package src;

public class StringCompression {

	public static void main(String[] args) {
		StringCompression sc = new StringCompression();
		System.out.println(sc.compress("aaabbbcccddddeeeaaaa"));

	}
	
	public String compress(String input) {
		int count = 1;
		String curr = ""+input.charAt(0);
		String returnString ="";
		for(int i =0; i< input.length()-1; i++) {
			if(curr.equals(""+input.charAt(i))) {
				count++;
			}
			else {
				returnString += curr+count;
				curr = ""+input.charAt(i);
				count = 1;
			}
		}
		
		return returnString;
	}

}
