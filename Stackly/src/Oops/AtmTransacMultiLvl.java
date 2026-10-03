package Oops;

import java.util.Scanner;

class Account {

	    String accountHolder;
	    double balance;

	    Account(String accountHolder, double balance) {
	        this.accountHolder = accountHolder;
	        this.balance = balance;
	    }

	    void displayAccount() {
	        System.out.println("Account Holder : " + accountHolder);
	        System.out.println("Balance        : " + balance);
	    }
	}


	// Child class
	class BankAccount extends Account {

	    BankAccount(String accountHolder, double balance) {
	        super(accountHolder, balance);
	    }

	    void deposit(double amount) {

	        balance = balance + amount;

	        System.out.println("Amount Deposited : " + amount);
	        System.out.println("Updated Balance  : " + balance);
	    }

	    void withdraw(double amount) {

	        if (amount <= balance) {

	            balance = balance - amount;

	            System.out.println("Amount Withdrawn : " + amount);
	            System.out.println("Updated Balance  : " + balance);

	        } else {

	            System.out.println("Insufficient Balance");
	        }
	    }
	}

	class ATM extends BankAccount {

	    int pin;

	    ATM(String accountHolder, double balance, int pin) {
	        super(accountHolder, balance);
	        this.pin = pin;
	    }

	    void accessATM(int enteredPin) {

	        if (enteredPin == pin) {

	            System.out.println("PIN Correct");
	            System.out.println("Access Granted");

	            doTransactions();

	        } else {

	            System.out.println("Wrong PIN");
	            System.out.println("Access Denied");
	        }
	    }

	    void doTransactions() {

	        Scanner sc = new Scanner(System.in);

	        int choice;

	        do {

	            System.out.println("----- ATM MENU -----");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Exit");

	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    System.out.println("Current Balance : " + balance);
	                    break;

	                case 2:
	                    System.out.print("Enter deposit amount: ");
	                    double depositAmount = sc.nextDouble();
	                    deposit(depositAmount);
	                    break;

	                case 3:
	                    System.out.print("Enter withdrawal amount: ");
	                    double withdrawAmount = sc.nextDouble();
	                    withdraw(withdrawAmount);
	                    break;

	                case 4:
	                    System.out.println("Thank you!");
	                    break;

	                default:
	                    System.out.println("Invalid Choice");
	            }

	        } while (choice != 4);
	    }
	}

	public class AtmTransacMultiLvl{

	    public static void main(String[] args) {

	        ATM atm = new ATM("Rahul", 10000, 1234);

	        atm.displayAccount();

	        Scanner sc = new Scanner(System.in);

	        System.out.print("\nEnter ATM PIN: ");
	        int enteredPin = sc.nextInt();

	        atm.accessATM(enteredPin);
	    }
	}
