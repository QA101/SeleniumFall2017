package src;

import java.util.Scanner;

public class ScannerSum {

    public static void main(String[] args) {
	    
        Scanner console = new Scanner(System.in);
        
    	SumThreeNumbers(console);
    	SumSomeNumbers(console);
    }
    
    public static void SumThreeNumbers(Scanner console){
        System.out.print("Please type three numbers: ");
        int num1 = console.nextInt();
        int num2 = console.nextInt();
        int num3 = console.nextInt();

        int sum = num1 + num2 + num3;
        System.out.println("The sum is " + sum);
    }
    
    public static void SumSomeNumbers(Scanner console){
    	System.out.print("How many numbers to add? ");
    	int count = console.nextInt();

    	int sum = 0;
    	for (int i = 1; i <= count; i++) {
    	    System.out.print("Type a number: ");
    	    sum = sum + console.nextInt();
    	}
    	System.out.println("The sum is " + sum);
    }

}
