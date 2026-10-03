package MultiDimenArray;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int employees = sc.nextInt();

        System.out.print("Enter number of months: ");
        int months = sc.nextInt();

        int[][] salary = new int[employees][months];

        for (int i = 0; i < employees; i++) {

            System.out.println("Enter salary for Employee " + (i + 1));

            for (int j = 0; j < months; j++) {
                System.out.print("Month " + (j + 1) + ": ");
                salary[i][j] = sc.nextInt();
            }
        }

        int highest = salary[0][0];
        int employeeIndex = 0;
        int monthIndex = 0;

        for (int i = 0; i < employees; i++) {

            for (int j = 0; j < months; j++) {

                if (salary[i][j] > highest) {
                    highest = salary[i][j];
                    employeeIndex = i;
                    monthIndex = j;
                }
            }
        }

        System.out.println();
        System.out.println("Highest Salary: " + highest);
        System.out.println("Employee: " + (employeeIndex + 1));
        System.out.println("Month: " + (monthIndex + 1));

        sc.close();

	}

}
