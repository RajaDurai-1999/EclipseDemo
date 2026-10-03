package Scanners;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
	     Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Student Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Class: ");
	        String cls = sc.nextLine();

	        System.out.print("Enter Mark 1: ");
	        int m1 = sc.nextInt();

	        System.out.print("Enter Mark 2: ");
	        int m2 = sc.nextInt();

	        System.out.print("Enter Mark 3: ");
	        int m3 = sc.nextInt();

	        int total = m1 + m2 + m3;

	        double average = total / 3;
	        
	        System.out.println("----------------------------------------------------------------");
	        System.out.printf("%-15s %-10s %-8s %-8s %-8s %-8s %-10s%n",
	                "Name", "Class", "Mark 1", "Mark 2", "Mark 3", "Total", "Average");
	        System.out.println("----------------------------------------------------------------");

	        System.out.printf("%-15s %-10s %-8d %-8d %-8d %-8d %-10.2f%n",
	                name, cls, m1, m2, m3, total, average);

	        System.out.println("-----------------------------------------------------------------");

	        System.out.println("Total   : " + total);
	        System.out.println("Average : " + average);

	}

}
