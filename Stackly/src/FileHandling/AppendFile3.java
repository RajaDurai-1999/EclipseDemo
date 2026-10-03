package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile3 {

	public static void main(String[] args) {
		try {
			FileWriter writer=new FileWriter("C:\\Users\\Dell\\OneDrive\\Desktop\\FileReader\\Student.txt",true);
			writer.write("Student Id : 102\n");
			writer.write("Student Name :Durai\n");
			writer.write("Course:FullStack\n");
			writer.write("Marks:95\n");
			
			writer.close();
			System.out.println("Data Append Successfully");
			
		}
		catch (IOException e) {
			System.out.println(" Error while Data Append ");

		}

	}

}
