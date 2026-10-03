package Scanners;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Consumer No: ");
	        int conNo = sc.nextInt();

	        System.out.print("Enter Consumer ID: ");
	        int conId = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Type of Building: ");
	        String building = sc.nextLine();

	        System.out.print("Enter Previous Unit: ");
	        int previousUnit = sc.nextInt();

	        System.out.print("Enter Current Unit: ");
	        int currentUnit = sc.nextInt();
	        
	        int units = currentUnit - previousUnit;

	        double amount = 0;
	        int freeUnits = 0;
	        int payableUnits = 0;

	        if (building.equalsIgnoreCase("House")) {

	            freeUnits = 200;
	            
	            payableUnits = units - freeUnits;

	            if (payableUnits <= 0) {

	                amount = 0;

	            } else if (payableUnits <= 200) {

	                amount = payableUnits * 5;
	            } else if (payableUnits <= 300) {

	                amount = 200 * 5
	                       + (payableUnits - 200) * 7;

	            } else if (payableUnits <= 400) {

	                amount = 200 * 5
	                       + 100 * 7
	                       + (payableUnits - 300) * 9;

	            } else if (payableUnits <= 600) {

	                amount = 200 * 5
	                       + 100 * 7
	                       + 100 * 9
	                       + (payableUnits - 400) * 10;

	            } else if (payableUnits <= 800) {

	                amount = 200 * 5
	                       + 100 * 7
	                       + 100 * 9
	                       + 200 * 10
	                       + (payableUnits - 600) * 11;

	            } else {

	                amount = 200 * 5
	                       + 100 * 7
	                       + 100 * 9
	                       + 200 * 10
	                       + 200 * 11
	                       + (payableUnits - 800) * 13;
	            }

	        }
	        else if (building.equalsIgnoreCase("Shop")) {

	            freeUnits = 0;

	            payableUnits = units;

	            if (payableUnits <= 100) {

	                amount = payableUnits * 7;

	            } else {

	                amount = 100 * 7
	                       + (payableUnits - 100) * 12;
	            }
	        }

	        else {

	            System.out.println("Invalid Building Type");
	            return;
	        }
	        
	        

	        System.out.println("Consumer No : " + conNo);
	        System.out.println("Consumer ID : " + conId);
	        System.out.println("Building Type : " + building);
	        System.out.println("Previous Unit : " + previousUnit);
	        System.out.println("Current Unit : " + currentUnit);
	        System.out.println("Consumed Units : " + units);
	        System.out.println("Free Units : " + freeUnits);
	        System.out.println("Payable Units : " + payableUnits);
	        System.out.printf("Total Amount : "+ amount);

	    sc.close();

	}

}
