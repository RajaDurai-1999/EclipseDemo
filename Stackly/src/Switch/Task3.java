package Switch;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double balance = 5000;
        double minBalance = 1000;

        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Balance");
        System.out.println("Enter the choice");

        int ch = sc.nextInt();

        switch (ch) {

        case 1:
            System.out.print("Enter withdraw amount: ");
            double withdraw = sc.nextDouble();

            if (withdraw >= 0) {

                if (balance > withdraw) {

                    if (balance - withdraw >= minBalance) {
                        balance = balance - withdraw;

                        System.out.println("Withdraw successful");
                        System.out.println("Balance = " + balance);
                    } 
                    else {
                        System.out.println("Minimum balance should be maintained");
                    }

                } 
                else {
                    System.out.println("Insufficient balance");
                }

            } 
            else {
                System.out.println("Withdraw amount cannot be negative");
            }

            break;

        case 2:
            System.out.print("Enter deposit amount: ");
            double deposit = sc.nextDouble();

            if (deposit > 0) {
                balance = balance + deposit;

                System.out.println("Deposit successful");
                System.out.println("Balance = " + balance);
            } 
            else {
                System.out.println("Invalid deposit amount");
            }

            break;

        case 3:
            System.out.println("Balance = " + balance);
            break;

        default:
            System.out.println("Invalid choice");
        }

        sc.close();

	}

}
