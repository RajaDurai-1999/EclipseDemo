package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyJpg {

	 public static void main(String[] args) throws IOException {

	        FileInputStream fis =
	                new FileInputStream("S:\\FileHandling\\Original\\ori.jpg");

	        FileOutputStream fos =
	                new FileOutputStream("S:\\FileHandling\\Copy\\copy.jpg");

	        int data;

	        while ((data = fis.read()) != -1) {
	            fos.write(data);
	        }

	        fis.close();
	        fos.close();

	        System.out.println("Image copied successfully");
	    }


	}


