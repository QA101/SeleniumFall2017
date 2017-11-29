package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExample {
	
	/**
	 * Sample on how to read from a file and write output to console using Scanner
	 * @param args
	 */
	public static void main(String[] args)  {
		File f = new File("./resources/input.txt");
		Scanner input;
		try {
			input = new Scanner(f);
			String line = "";
			while(input.hasNextLine()) {
				line = input.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
