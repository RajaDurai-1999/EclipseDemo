package MultiDimenArray;

import java.util.Scanner;

public class HouseRent {
	  static double calculateRent(double[] details) {

	        double monthlyRent = details[0];
	        double months = details[1];

	        return monthlyRent * months;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int choice;

	        do {
	            System.out.println("1. 1 BHK");
	            System.out.println("2. 2 BHK");
	            System.out.println("3. 3 BHK");
	            System.out.println("4. Exit");

	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:

	                    double[] oneBHK = new double[2];

	                    System.out.print("Enter monthly rent: ");
	                    oneBHK[0] = sc.nextDouble();

	                    System.out.print("Enter number of months: ");
	                    oneBHK[1] = sc.nextDouble();

	                    System.out.println("Total rent = "
	                            + calculateRent(oneBHK));

	                    break;

	                case 2:

	                    double[] twoBHK = new double[2];

	                    System.out.print("Enter monthly rent: ");
	                    twoBHK[0] = sc.nextDouble();

	                    System.out.print("Enter number of months: ");
	                    twoBHK[1] = sc.nextDouble();

	                    System.out.println("Total rent = "
	                            + calculateRent(twoBHK));

	                    break;

	                case 3:

	                    double[] threeBHK = new double[2];

	                    System.out.print("Enter monthly rent: ");
	                    threeBHK[0] = sc.nextDouble();

	                    System.out.print("Enter number of months: ");
	                    threeBHK[1] = sc.nextDouble();

	                    System.out.println("Total rent = "
	                            + calculateRent(threeBHK));

	                    break;

	                case 4:

	                    System.out.println("Thank you!");

	                    break;

	                default:

	                    System.out.println("Invalid choice.");

	            }

	        } while (choice != 4);

	        sc.close();
	    }

}
