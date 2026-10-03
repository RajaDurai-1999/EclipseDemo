package MultiDimenArray;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients: ");
        int patients = sc.nextInt();

        System.out.print("Enter number of time readings: ");
        int times = sc.nextInt();

        double[][] temperature = new double[patients][times];

        // Input temperature
        for (int i = 0; i < patients; i++) {

            System.out.println("\nPatient " + (i + 1));

            for (int j = 0; j < times; j++) {

                System.out.print("Enter temperature at Time "
                        + (j + 1) + ": ");

                temperature[i][j] = sc.nextDouble();
            }
        }

        System.out.println("---------------TEMPERATURE REPORT------------");

        for (int i = 0; i < patients; i++) {

            System.out.print("Patient " + (i + 1) + ": ");

            for (int j = 0; j < times; j++) {

                System.out.print(temperature[i][j] + "  ");
            }

            System.out.println();
        }
        System.out.println("-----------PATIENT STATUS----------");

        for (int i = 0; i < patients; i++) {

            boolean fever = false;

            for (int j = 0; j < times; j++) {

                if (temperature[i][j] >= 100.4) {
                    fever = true;
                    break;
                }
            }

            if (fever) {

                System.out.println(
                    "Patient " + (i + 1)
                    + "  FEVER - Continue Treatment"
                );

            } else {

                System.out.println(
                    "Patient " + (i + 1)
                    + "  NORMAL - No Fever"
                );
            }
        }

        sc.close();

	}

}
