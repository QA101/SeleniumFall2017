package src;

public class AddingStrings {

	public static void main(String[] args) {
		
		int x = 123;
		int y = 250;
		
		/*
		 * Doing string concatenation in this way can have mixed results.
		 * 
		 * This system.out.println will result in "373STRING123250" but that may not be what you want
		 */
		System.out.println(x + y +"STRING" + x + y);

		
		/*
		 * A common approach is to start string concatenation with an empty string which is 2 double quotes
		 */
		System.out.println(""+x + y +"STRING" + x + y+"");
		
		
		/*
		 * A much more common approach is actually store a concatenation string in a string variable.
		 */
		String myString = ""+x + y +"STRING" + x + y;
		System.out.println(myString);
		
		/*
		 * Say that you want to actually add the ints first then add them to the string.
		 * You can do this through parentheses
		 * 
		 */
		String myOtherString = (x + y) +"STRING" + (x + y);
		System.out.println(myOtherString);
	}

}
