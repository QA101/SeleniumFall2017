package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {
		 // open the file
	    Scanner console = new Scanner(System.in);
	    System.out.print("What is the name of the text file? ");
	    String fileName = console.nextLine();
	    Scanner input = new Scanner(new File(fileName));

	    HashMap<String, Integer> words = new HashMap<String, Integer>();
	    while (input.hasNext()) {
	      String word = input.next();
	      if (!words.containsKey(word)) {
	        words.put(word, 1);
	      } else {
	        int count = words.get(word); // the count of word
	        words.put(word, count + 1);
	      }
	    }
	    System.out.println("Number of UNIQUE words in " + fileName + ": " + words.size());
	}
}
