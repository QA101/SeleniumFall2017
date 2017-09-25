package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OpenAndRead {

	public static void main(String[] args){
		// TODO Auto-generated method stub	
	}
	public void ReadMyFile(String location) throws IOException{
		
		BufferedReader br = new BufferedReader(new FileReader("file.txt"));
		try {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		} finally {
		    br.close();
		}
	}

}
