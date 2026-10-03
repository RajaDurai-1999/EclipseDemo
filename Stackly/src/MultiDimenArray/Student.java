package MultiDimenArray;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter number of students: ");
		        int students = sc.nextInt();

		        System.out.print("Enter number of subjects: ");
		        int subjects = sc.nextInt();

		        int[][] marks = new int[students][subjects];

		        int[] totals = new int[students];

		        double[] averages = new double[students];

		        char[] grades = new char[students];

		        
		        for (int i = 0; i < students; i++) {

		            System.out.println("\nEnter marks for Student " + (i + 1));

		            int total = 0;

		            for (int j = 0; j < subjects; j++) {

		                while (true) {

		                    System.out.print("Subject " + (j + 1) + ": ");

		                    int mark = sc.nextInt();

		                    if (mark >= 0 && mark <= 100) {

		                        marks[i][j] = mark;

		                        total += mark;

		                        break;

		                    } else {

		                        System.out.println(
		                            "Invalid! Enter marks between 0 and 100."
		                        );
		                    }
		                }
		            }

		            totals[i] = total;

		            averages[i] = total / (double) subjects;
		            
		            if (averages[i] >= 90)
		                grades[i] = 'A';

		            else if (averages[i] >= 75)
		                grades[i] = 'B';

		            else if (averages[i] >= 60)
		                grades[i] = 'C';

		            else if (averages[i] >= 50)
		                grades[i] = 'D';

		            else
		                grades[i] = 'F';
		        }

		        int topperIndex = 0;

		        for (int i = 1; i < students; i++) {

		            if (totals[i] > totals[topperIndex]) {

		                topperIndex = i;
		            }
		        }

		        System.out.println(
		            "\n===================== FINAL REPORT ====================="
		        );

		        System.out.printf("%-12s", "Student");

		        for (int j = 0; j < subjects; j++) {

		            System.out.printf("%-10s", "Sub" + (j + 1));
		        }

		        System.out.printf( "%-10s%-10s%-10s%n","Total","Average","Grade");

		        System.out.println(
		            "--------------------------------------------------------"
		        );

		        for (int i = 0; i < students; i++) {

		            System.out.printf(
		                "%-12s",
		                "Student " + (i + 1)
		            );

		            for (int j = 0; j < subjects; j++) {

		                System.out.printf(
		                    "%-10d",
		                    marks[i][j]
		                );
		            }

		            System.out.printf(
		                "%-10d%-10.2f%-10c%n",
		                totals[i],
		                averages[i],
		                grades[i]
		            );
		        }

		        System.out.println("\n===================== TOPPER =====================");

		        System.out.printf(
		            "Student     : %d%n",
		            topperIndex + 1
		        );

		        System.out.printf(
		            "Total Marks : %d%n",
		            totals[topperIndex]
		        );

		        System.out.printf(
		            "Average     : %.2f%n",
		            averages[topperIndex]
		        );

		        System.out.printf(
		            "Grade       : %c%n",
		            grades[topperIndex]
		        );

		        sc.close();
		    }
}

	
