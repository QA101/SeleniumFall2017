package src;

public class Palindrome {

	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		System.out.println(p.Pal("civic"));

	}
	
	public Boolean Pal(String input) {
		int end = input.length()-1;
		Boolean isPalindrome = true;
		
		for (int i =0; i<input.length()/2; i++) {
			if (input.charAt(i) != input.charAt(end)) {
				isPalindrome = false;
				break;
			}
			end--;
		}
		return isPalindrome;
	}

}
