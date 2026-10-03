package Polymorphism;

import java.util.Scanner;

public class CarRentalPgmOverLoad {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CarRental rental = new CarRental();

        int choice;

        do {

            System.out.println("......CAR RENTAL SYSTEM...........");
            System.out.println("1. Rent by Hour");
            System.out.println("2. Rent by Day");
            System.out.println("3. Rent with Driver");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();


            switch (choice) {

                case 1:

                    System.out.print("Enter number of hours: ");
                    int hours = sc.nextInt();

                    rental.calculateRent(hours);

                    break;


                case 2:

                    System.out.print("Enter number of days: ");
                    int days = sc.nextInt();

                    System.out.print("Enter daily rent: ");
                    double dailyRate = sc.nextDouble();

                    rental.calculateRent(days, dailyRate);

                    break;


                case 3:

                    System.out.print("Enter number of days: ");
                    int driverDays = sc.nextInt();

                    System.out.print("Do you need a driver? (true/false): ");
                    boolean driver = sc.nextBoolean();

                    rental.calculateRent(driver, driverDays);

                    break;


                case 4:

                    System.out.println("Thank you for using Car Rental System!");
                    break;


                default:

                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}

class CarRental {
    void calculateRent(int hours) {

        double hourlyRate = 200;
        double total = hours * hourlyRate;

        System.out.println("Rental Type : Hourly");
        System.out.println("Hours       : " + hours);
        System.out.println("Total Rent  : ₹" + total);
    }
    void calculateRent(int days, double dailyRate) {

        double total = days * dailyRate;

        System.out.println("Rental Type : Daily");
        System.out.println("Days        : " + days);
        System.out.println("Daily Rate  : ₹" + dailyRate);
        System.out.println("Total Rent  : ₹" + total);
    }
    void calculateRent(boolean driver, int days) {

        double carRent = days * 1500;
        double driverCharge = 0;

        if (driver) {
            driverCharge = days * 500;
        }

        double total = carRent + driverCharge;

        System.out.println("Rental Type  : Car + Driver");
        System.out.println("Days         : " + days);
        System.out.println("Car Rent     : ₹" + carRent);
        System.out.println("Driver       : " + (driver ? "Yes" : "No"));
        System.out.println("Driver Charge: ₹" + driverCharge);
        System.out.println("Total Rent   : ₹" + total);
    }
}


