package Main;

import java.util.Scanner;

public class weekTwo {

	public static void main(String[] args) {

	}
	
	
	/*
	 * Write a function that takes an array and a int
	 * the function should find the int in the array then return its location
	 * 
	 * Function should use a while loop
	 */
	public static int LocateInArrayWhileLoop(int[] input, int FindMe){

		return 0;
	}
	
	/*
	 * Write a function that takes an array and a int
	 * the function should find the int in the array then return its location
	 * 
	 * Function should use a for loop
	 */
	public static int LocateInArrayForLoop(int[] input, int FindMe){
		return 0;
	}
	
	/*
	 * Write a function that takes an array and a int
	 * the function should find the int in the array then return its location
	 * 
	 * Function should use a do-while loop
	 */
	public static int LocateInArrayDoWhileLoop(int[] input, int FindMe){
		return 0;
	}
	
	/*
	 * Write function that take two inputs int lower and int upper
	 * The function should have a variable x which is set to the value equal to lower
	 * 
	 * Then the function should increment the variable x while x is less than upper
	 */
	
	
	public static String ForLoop(int n, String myString){
		String returnString = "";
		for (int i = 0; i<n; i++){
			returnString = returnString + myString;
		}
		return returnString;
	}
	
	/*
	 *
	 *Write a function that takes an the following inputs x, y, z
	 *The function should have a single for loop which increments from 0 to x
	 *Then loop through a for loop nested within the x loop from 0 to y
	 *Then loop through a for loop nested within the y loop from 0 to z
	 *
	 *The function should return the count of times the z loop is passed through
	 *Note: do not try to solve by multiplying the numbers together
	 */
	
	public static int NestedLoop(int x, int y, int z){
		int count = 0;
		//your loop code here
		for(int i = 0; i <x; i++)
		{
			for(int j = 0; j<y; j++)
			{
				for(int k =0; k<z; k++){
					count +=1;
				}
			}
		}
		return count;
	}
	
	/*
	 *
	 *Write a function that takes int x, int y as an input
	 *The function should nest a y for loop inside of an x for loop
	 *Print "Hello World" within the y for loop
	 */
	
	public static void NestedLoopHelloWorld(int x, int y){
		for(int i = 0; i <x; i++)
		{
			for(int j = 0; j<y; j++)
			{
				System.out.println("Hello World");
			}
		}
	}
	
	/*
	 * Week Two Capstone
	 * 
	 * Write a program that has an array of ints and create an array of boolean.
	 * The boolean will be set to true if the int is less than or equal to 10
	 * Example:
	 * [1, 2, 3, 5, 10, 15, 20, 40]
	 * Result:
	 * [true, true, true, true, true, false, false, false]
	 */
	
	public static Boolean[] ReturnBoolean(int input[]){
		Boolean[] result = new Boolean[2];
		result[0] = true;
		result[1] = true;
		return result;
	}

}
