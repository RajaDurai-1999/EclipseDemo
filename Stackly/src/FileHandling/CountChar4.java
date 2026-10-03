package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class CountChar4 {

	public static void main(String[] args) {
	int characters=0;
	int spaces=0;
	int digit=0;
	
	try {
		FileReader reader =new FileReader("C:\\Users\\Dell\\OneDrive\\Desktop\\FileReader\\Student.txt");
		int ch;
		while((ch=reader.read())!=-1) {
			characters++;
		if(ch ==' ') {
			spaces++;
		}
		if(Character.isDigit((char)ch)) {
			digit++;
		}
	}
		reader.close();
		
		System.out.println("Characters :"+characters);
		System.out.println("Spaces :"+spaces);
		System.out.println("Digit :"+digit);

	}
	catch (IOException e) {
		 System.out.println("Error reading file.");
}

}
}