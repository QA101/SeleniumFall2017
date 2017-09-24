package Main;

import java.util.Scanner;

public class ReadFromConsole {
	public static void main(String[] args){
		TakeInput();
	}
	public static void TakeInput(){
		String input = "";
		Scanner scanner = new Scanner(System.in);
		do{
		System.out.println("What should I print: ");
		input = scanner.nextLine();
		System.out.println(input);
		input = input.toUpperCase();
		switch (input){
			case "HI":
				System.out.println("Oh hi...");
			    break;
			case "BYE":
				System.out.println("Did you mean quit");
				break;
			default:
				break;
			}

		} while(!input.equals("QUIT"));
		System.out.println("Good-bye");
		scanner.close();
	}
}
