package Switch;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter year (1-3): ");
	        int year = sc.nextInt();

	        System.out.print("Enter college fee: ");
	        double fee = sc.nextDouble();

	        double discount = 0;
	        double finalFee;

	        switch (year) {

	            case 1:
	            case 2:
	                System.out.println("No scholarship for 1st and 2nd year.");
	                break;

	            case 3:
	                System.out.print("Enter CGPA: ");
	                double cgpa = sc.nextDouble();

	                if (cgpa >= 9) {
	                    discount = 30;
	                }
	                else if (cgpa >= 8) {
	                    discount = 20;
	                }
	                else if (cgpa > 7) {
	                    discount = 10;
	                }
	                else {
	                    discount = 0;
	                }

	                break;

	            default:
	                System.out.println("Invalid year.");
	        }

	        double discountAmount = fee * discount / 100;
	        finalFee = fee - discountAmount;

	        System.out.println("Scholarship = " + discount + "%");
	        System.out.println("Final Fee = " + finalFee);

	        sc.close();

	}

}
