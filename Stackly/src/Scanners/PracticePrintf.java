package Scanners;

import java.util.Scanner;

public class PracticePrintf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Name:");
		String name=sc.nextLine();
		
		System.out.println("Enter Mark 1");
		int mark1=sc.nextInt();
		
		System.out.println("Enter Mark 2");
		int mark2=sc.nextInt();
		
		System.out.println("Enter Mark 3");
		int mark3=sc.nextInt();
		
		int total=mark1+mark2+mark3;
		
		System.out.println("--------------------------------------------------------------------");
		System.out.printf("%-15s %-8s %-8s %-8s %-10s%n","Name","Mark1","Mark2","Mark3","Total");
		System.out.printf("%-15s %-8d %-8d %-8d %-10d%n",name,mark1,mark2,mark3,total);
		System.out.printf("---------------------------------------------------------------------");

	}

}
