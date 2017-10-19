package src;

import java.util.Arrays;

public class ArrayExamples {

	public static void main(String[] args) {
		ReverseArrayWithinSingleArray();
	}
	
	/**
	 * Prints the data at each index
	 */
	public static void PrintDataAtIndex() {
		//creates an array with elements {1,2,3,4}. This will force the array to have a length of 4.
		int[] x = {1,2,3,4};
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
	}
	
	/**
	 * Prints all data in an array
	 * There are several ways to print the data in an array
	 */
	public static void PrintAllDataInArray() {
		//creates an array with elements {1,2,3,4}. This will force the array to have a length of 4.
		int[] x = {1,2,3,4};
		
		//This will print all the data in an array by looping through the array
		System.out.print("x: ");
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i]);
		}
		System.out.println();
		
		//creates an array with elements {5, 6, 7, 8, 10, 12, 250}. This will force the array to have a length of 7.
		int[] y = {5, 6, 7, 8, 10, 12, 250};
		
		/*
		 * This is will print an array using a built in function
		 * Note: you need to import java.util.Arrays to use this function and imports go at the top of the java file
		 * We will talk about imports later
		 */
		System.out.println("y:"+Arrays.toString(y));
 	}
	
	/**
	 * Shows different ways to create an int array
	 */
	public static void ArrayCreation() {
		
		//Create an array variable which points to nothing
		int[] x;
		//Actually creates the array with length 3. Points to that array location in memory
		x = new int[3];
		
		//print the contents of x
		System.out.println("x:"+Arrays.toString(x));
		
		//Create an array of {1, 2, 3, 4}. This will also force the array size to 4 because there are 4 elements/items in the array
		int[] y = {1,2,3,4};
		
		//print the contents of y
		System.out.println("y:"+Arrays.toString(y));
		
		//Create a array with length 6. All values are set to 0
		int[] z = new int[6];
		
		System.out.println("z:"+Arrays.toString(z));
	}
	
	/**
	 * Shows how to update an array's data at a specific index
	 */
	public static void UpdateDataAtIndex() {
		int[] x = new int[6];
		
		x[5] = 100;
		
		System.out.println("x:"+Arrays.toString(x));
	}
	
	/**
	 * Shows how to resize an array
	 */
	public static void ResizeArray() {
		//creates an array with elements {1,2,3,4}. This will force the array to have a length of 4.
		int[] x = {1,2,3,4};
		//creates an array which is 2 times larger than array x
		int[] temp = new int[x.length*2];
		
		/*
		 * Cycles through array x and copies data from x into temp
		 * This will only copy the data, x remains the same size and still has the same data
		 */
		for(int i =0; i<x.length; i++) {
			temp[i] = x[i];
		}
		
		/*
		 * This points x to the same memory location as temp.
		 * You aren't resizing the original array but instead pointing x to temp which already has the same data from x but with more slots for additional data
		 * By points x to a larger block of memory, you have "resized" the array
		 */
		x = temp;
		
		/*
		 * Changing the value stored at index 5
		 * Notice that this is calling the index at temp
		 * Functionally. This is the same as saying x[5] = 10 because they are pointing to the same memory block
		 */
		temp[5] = 10;
		
		/*
		 * prints the contents of x
		 * Notice that we are printing x but because x and temp are pointing to the same memory block, x will be updated with any changes to temp
		 */
		System.out.println("x:"+Arrays.toString(x));
	}
	
	/**
	 * Shows how to clone the the data from one array to another array without changing the pointer
	 * This uses the built in function
	 */
	public static void CloneDataBuiltInFunction() {
		int[] x = {1,2,3,4};
		int[] y = x.clone();
		
		System.out.println("x:"+Arrays.toString(x));
		System.out.println("y:"+Arrays.toString(y));		
	}
	
	/**
	 * Shows how to clone the the data from one array to another array without changing the pointer
	 * This uses a for loop
	 */
	public static void CloneDataByForLoop() {
		int[] x = {1,2,3,4};
		//create an array filled with all 0's with the same length as x
		int[] y = new int[x.length];
		
		/*
		 * copies data from x into y
		 * x is not modified
		 */
		for(int i = 0; i < x.length; i++) {
			y[i] = x[i];
		}
		
		System.out.println("x:"+Arrays.toString(x));
		System.out.println("y:"+Arrays.toString(y));
	}
	
	/**
	 * Shows an example of what happens when you try to access data outside of the array bounds
	 */
	public static void OutOfBoundsExample() {
		int[] x = {1,2,3,4};
		
		/*
		 * Notice that this for loop will try to access data outside of the bounds of the array (x.length*2)
		 */
		for(int i = 0; i < x.length*2; i++) {
			System.out.println(x[i]);
		}
				
	}

	/**
	 * Shows how to reverse an array using a for loop
	 */
	public static void ReverseArrayUsingAnotherArray() {
		int[] x = {1, 2, 3, 4};
		int[] temp = new int[x.length];
		
		int curr = 0;
		
		System.out.println("Before:"+Arrays.toString(x));
		
		/**
		 * Notice that this for loop is starting at the end of the array.
		 * You must use length-1 because otherwise there will be an out of bound exception
		 * There is another variable curr, to track the current location in the temp array
		 * the curr variable is being incremented by 1 each time the for loop is executed
		 */
		for (int i =x.length-1; i>=0; i--) {
			temp[curr] = x[i];
			curr++;
		}
		x = temp;
		System.out.println("After: "+Arrays.toString(x));		
	}
	
	/**
	 * Shows how to reverse an array using a for loop and another array
	 */
	public static void ReverseArrayWithinSingleArray() {
		int[] x = {1, 2, 3, 4};
		
		System.out.println("Before:"+Arrays.toString(x));
		
		/**
		 * This solution is more complicated but doesn't require additional variables
		 * This for loop will continue until the mid-point of the array is reached because you only need to reverse until the midpoint
		 * Steps:
		 * 		You first find the two locations to be swapped
		 * 		Store the first location's data in a temp variable
		 * 		Populate the first location with data from the second location
		 * 		Finally populate the second location with the temp data
		 */
		for (int i = 0 ; i<x.length /2; i++) {
			int temp = x[i];
			x[i] = x[x.length-i-1];
			x[i] = temp;
		}
		System.out.println("After: "+Arrays.toString(x));		
	}

}
