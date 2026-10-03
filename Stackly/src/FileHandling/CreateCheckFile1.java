package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateCheckFile1 {

	public static void main(String[] args) {
		File fr=new File("C:\\Users\\Dell\\OneDrive\\Desktop\\FileReader\\Student.txt");
		try {
			if(fr.createNewFile()) {
				System.out.println("File Created Successfully");
			}
			else {
				System.out.println("File Already Created");
			}
			
			System.out.println("FileName :"+fr.getName());
			System.out.println("FilePath :"+fr.getAbsolutePath());
			System.out.println("Readable :"+fr.canRead());
			System.out.println("Writable :"+fr.canWrite());
			
		}
		catch (IOException ie) {
			System.out.println("Error occurred");
			ie.printStackTrace();

		}
		

	}

}
