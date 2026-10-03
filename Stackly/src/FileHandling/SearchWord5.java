package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchWord5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Word");
		String searchword=scan.nextLine();
		int lineNumber=0;
		int count=0;
		
		try {
			BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\Dell\\OneDrive\\Desktop\\FileReader\\Student.txt"));
			
			String line;
			while((line=reader.readLine())!=null) {
				lineNumber++;
				if(line.toLowerCase().contains(searchword.toLowerCase())) {
					count++;
					System.out.println(searchword + " found in line " + lineNumber);
					
				}
				
			}
			reader.close();
			 System.out.println("Total occurrences: " + count);
	}
		catch (IOException e) {
			System.out.println("Error reading file.");
		}
		scan.close();

	}

}
