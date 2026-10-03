package Switch;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter month 1-12: ");
        int month = sc.nextInt();

        int days;

        switch (month) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;

            case 2:
                System.out.print("Enter year: ");
                int year = sc.nextInt();

                if (year % 400 == 0) {

                    days = 29;

                } else {

                    days = 28;
                }

                break;

            default:
                days = 0;
                System.out.println("Invalid month");
        }

        if (days != 0) {
            System.out.println("Number of days = " + days);
        }

        sc.close();
    }
}


