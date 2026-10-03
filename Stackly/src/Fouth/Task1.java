package Fouth;

public class Task1 {
	public static void main(String[] args) {
		int a = 10;
        int b = 25;
        int c = 15;

        if (a > b && a > c) {
            System.out.println("A is greatest");
        }
        else if (b > a && b > c) {
            System.out.println("B is greatest");
        }
        else {
            System.out.println("C is greatest");
        }
        
//        2
        int num = 25;

        if (num > 0) {
            System.out.println("Positive");
        }
        else if (num < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }

        if (num % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

//        3
        String username = "Raja";
        String password = "1234";

        if (username.equals("Raja") && password.equals("1234")) {
            System.out.println("Login Successful");
        }
        else {
            System.out.println("Invalid Username or Password");
        }

//        4
        String employmentstatus="employed";
        double salary=60000;
        int cibilScore=700;
        
        if(employmentstatus.equals("employed")) {
        	if(salary>=50000) {
        		if(cibilScore>600) {
        			System.out.println("Loan Eligible");
        		}
        		else {
        			System.out.println(" loan Not Eligible");
        		}
        	}
        	else {
        		System.out.println(" loan Not Eligible");
        		
        	}
        }
        else {
        	System.out.println(" loan Not Eligible");
        }
        
//        5
        int age = 25;
        double weight = 60;

        if (age >= 18 && weight >= 50) {
            System.out.println("Eligible for Blood Donation");
        }
        else {
            System.out.println("Not Eligible for Blood Donation");
        }
        
	}

}
