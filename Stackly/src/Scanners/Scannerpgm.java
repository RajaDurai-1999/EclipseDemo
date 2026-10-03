package Scanners;

import java.util.Scanner;

public class Scannerpgm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Name");
		String userName=sc.nextLine();
		
		System.out.println("Enter your Password");
		String password=sc.nextLine();
		
		String result=userName.equals("Raja") && password.equals("12345")
				? "Login Successful"
		                : "Invalid Username or Password";

		        System.out.println(result);
		
		sc.close();
		
		
		
		
		

	}

}
