package Switch;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int category;	
	        int item;
	        double price = 0;
	        String foodName = "";

	        System.out.println("FOOD MENU");
	        System.out.println("1. South Indian");
	        System.out.println("2. Fast Food");
	        System.out.println("3. Drinks");

	        System.out.print("Enter your choice: ");
	        category = sc.nextInt();

	        switch (category) {

	            case 1:
	                System.out.println("South Indian ");
	                System.out.println("1. Idli     - Rs.40");
	                System.out.println("2. Dosa     - Rs.60");
	                System.out.println("3. Pongal   - Rs.50");

	                System.out.print("Enter your item: ");
	                item = sc.nextInt();

	                switch (item) {

	                    case 1:
	                        foodName = "Idli";
	                        price = 40;
	                        break;

	                    case 2:
	                        foodName = "Dosa";
	                        price = 60;
	                        break;

	                    case 3:
	                        foodName = "Pongal";
	                        price = 50;
	                        break;

	                    default:
	                        System.out.println("Invalid item");
	                }
	                break;

	            case 2:
	                System.out.println("Fast Food");
	                System.out.println("1. Burger  - Rs.120");
	                System.out.println("2. Pizza   - Rs.200");
	                System.out.println("3. Sandwich - Rs.100");

	                System.out.print("Enter your item: ");
	                item = sc.nextInt();

	                switch (item) {

	                    case 1:
	                        foodName = "Burger";
	                        price = 120;
	                        break;

	                    case 2:
	                        foodName = "Pizza";
	                        price = 200;
	                        break;

	                    case 3:
	                        foodName = "Sandwich";
	                        price = 100;
	                        break;

	                    default:
	                        System.out.println("Invalid item");
	                }
	                break;

	            case 3:
	                System.out.println("Drinks");
	                System.out.println("1. Tea      - Rs.20");
	                System.out.println("2. Coffee   - Rs.30");
	                System.out.println("3. Juice    - Rs.50");

	                System.out.print("Enter your item: ");
	                item = sc.nextInt();

	                switch (item) {

	                    case 1:
	                        foodName = "Tea";
	                        price = 20;
	                        break;

	                    case 2:
	                        foodName = "Coffee";
	                        price = 30;
	                        break;

	                    case 3:
	                        foodName = "Juice";
	                        price = 50;
	                        break;

	                    default:
	                        System.out.println("Invalid item");
	                }
	                break;

	            default:
	                System.out.println("Invalid category");
	        }

	        if (price > 0) {
	            System.out.println(" BILL ");
	            System.out.println("Food  : " + foodName);
	            System.out.println("Price : Rs." + price);
	            System.out.println("Total : Rs." + price);
	        }

	        sc.close();

	}

}
