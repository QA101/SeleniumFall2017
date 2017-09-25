package src;

import java.util.Random;
import java.util.Scanner;

public class RandomExample {

	public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.print("How many random numbers:");
		int amount = console.nextInt();
		
		System.out.print("Min int: ");
		int min = console.nextInt();
		
		System.out.print("Max int: ");
		int max = console.nextInt();
		
		int range = max - min;
		
		Random rand = new Random();
		
		for( int i = 0; i < amount; i++){
			System.out.println(rand.nextInt(range)+ min);
		}

	}

}
