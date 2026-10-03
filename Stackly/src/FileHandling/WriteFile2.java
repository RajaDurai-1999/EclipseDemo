package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile2 {

	public static void main(String[] args) {
		try {
			FileWriter writer=new FileWriter("C:\\Users\\Dell\\OneDrive\\Desktop\\FileReader\\Student.txt");
			
			writer.write("Student Id:101\n");
			writer.write("StudentName:Raja\n");
			writer.write("Course:Java\n");
			writer.write("Marks:90\n");
			
			writer.close();
			System.out.println("Data written Successfully");
		}
		catch (IOException e) {
			System.out.println("Error while writing");
		}

	}

}
