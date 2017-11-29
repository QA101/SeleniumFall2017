package src;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteExample {

	FileWriter writer;
	PrintWriter pw;
	
	/**
	 * Launches the different ways to write to files
	 * @param args
	 */
	public static void main(String[] args) {		
		FileWriteExample example = new FileWriteExample();
		example.FileWriterOnly();
		example.FileWriterWithPrintWriter();
		example.FileWriterWithPrintWriterAndAppend();
	}
	
	/*
	 * Private method which uses a FileWriter to overwrite a file
	 */
	private void FileWriterOnly() {
		try{
			 writer = new FileWriter("./resources/tempWriterOnly.txt");
			 writer.write("Hello");
			 writer.write("World");
			 writer.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	/*
	 * Private method which uses a FileWriter and a PrintWriter to overwrite a file
	 * By using the PrintWriter class, I can call println methods easily
	 */
	private void FileWriterWithPrintWriter() {
		try {
			 writer = new FileWriter("./resources/tempOverwrite.txt");
			 pw = new PrintWriter(writer);
			 pw.println("Hello");
			 pw.println("World");
			 pw.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	/*
	 * Private method which uses a FileWriter and PrintWrite to append to a file
	 */
	private void FileWriterWithPrintWriterAndAppend() {
		try {
			 writer = new FileWriter("./resources/tempAppend.txt", true);
			 pw = new PrintWriter(writer);
			 pw.println("Hello");
			 pw.println("World");
			 pw.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
}

