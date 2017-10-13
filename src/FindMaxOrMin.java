package src;

import java.util.Scanner;

public class FindMaxOrMin {
	public static final String ExitString = "EXIT";
	public static final String FindMaxString = "MAX";
	public static final String FindMinString = "MIN";
	int[] tracking = new int[5];
	int curr = 0;
	boolean running = true;
	boolean building = true;
	
	
	/**
	 * Main method to call the other methods within this class
	 * will continue to run until a user inputs the ExitString
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		FindMaxOrMin FindIt = new FindMaxOrMin();

		while(FindIt.running) {
			FindIt.CreateNewRun();
			System.out.println("Enter ints:");
			while(FindIt.building) {
				FindIt.ProcessInput(console.nextLine());
			}
			FindIt.building = true;
		}
		console.close();
	}
	
	/**
	 * 
	 * Resets all variables which can be impacted by generating a max or min value
	 * 
	 */
	private void CreateNewRun() {
		tracking = new int[5];
		curr = 0;
	}
	
	/**
	 * 
	 * Takes an scanner to process all input
	 * Checks for exceptions and will process commands when a non-int is detected
	 * While loop will exit once a max or min command is encountered
	 * 
	 * @param console
	 */
	private void ProcessInput(String input) {
		try {
			tracking[curr] = Integer.parseInt(input);
			curr++;
			if(curr == tracking.length-1) {
				tracking = resize(tracking);
			}
		} catch(java.lang.NumberFormatException ime_exception){
			if ( input.toUpperCase().equals(ExitString)){
				System.out.println("Good-bye");
				running = false;
				building = false;
			}
			else if (input.toUpperCase().equals(FindMaxString)) {
				System.out.println(FindTheMax(tracking));
				building = false;
			}
			else if (input.toUpperCase().equals(FindMinString)) {
				System.out.println(FindTheMin(tracking));
				building = false;
			}
			else {
				System.out.println("Thats not an int");
			}
		} catch(Exception e ) {
				
		}
	}
	
	/**
	 * Takes an input array and returns the max value from the array
	 * 
	 * @param input
	 * @return
	 */
	private int FindTheMax(int[] input) {
		int max = Integer.MIN_VALUE;
		for(int i =0; i < input.length; i++) {
			if (input[i] > max) {
				max = input[i];
			}
		}
		return max;
	}
	
	/**
	 * Takes an input array and returns the min value from the array
	 * 
	 * @param input - A input array of int
	 * @return min - returns the min value within the array.
	 */
	private int FindTheMin(int[] input) {
		int min = Integer.MAX_VALUE;
		for(int i =0; i < input.length; i++) {
			if (input[i] < min) {
				min = input[i];
			}
		}
		return min;
	}
	
	/**
	 * Takes an input array and resizes that array to 2 times the current size
	 * Works by creating a temp array and pushing the contents of the input array element by element
	 * 
	 * @param input - takes an input array of int
	 * @return temp - returns the new array with the larger size
	 */
	private int[] resize(int[] input) {
		int[] temp = new int[input.length*2];
		for(int i =0; i<input.length; i++) {
			temp[i] = input[i];
		}
		return temp;
	}

}
