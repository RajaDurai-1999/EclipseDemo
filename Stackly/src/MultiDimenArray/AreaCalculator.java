package MultiDimenArray;

import java.util.Scanner;

public class AreaCalculator {
	static double circleArea(double[] values) {
        double radius = values[0];
        return Math.PI * radius * radius;
    }

    static double rectangleArea(double[] values) {
        double length = values[0];
        double width = values[1];
        return length * width;
    }

    static double triangleArea(double[] values) {
        double base = values[0];
        double height = values[1];
        return 0.5 * base * height;
    }

    static double squareArea(double[] values) {
        double side = values[0];
        return side * side;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n----- AREA CALCULATOR -----");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Square");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    double[] circle = new double[1];

                    System.out.print("Enter radius: ");
                    circle[0] = sc.nextDouble();

                    System.out.println("Area of Circle = "
                            + circleArea(circle));
                    break;

                case 2:
                    double[] rectangle = new double[2];

                    System.out.print("Enter length: ");
                    rectangle[0] = sc.nextDouble();

                    System.out.print("Enter width: ");
                    rectangle[1] = sc.nextDouble();

                    System.out.println("Area of Rectangle = "
                            + rectangleArea(rectangle));
                    break;

                case 3:
                    double[] triangle = new double[2];

                    System.out.print("Enter base: ");
                    triangle[0] = sc.nextDouble();

                    System.out.print("Enter height: ");
                    triangle[1] = sc.nextDouble();

                    System.out.println("Area of Triangle = "
                            + triangleArea(triangle));
                    break;

                case 4:
                    double[] square = new double[1];

                    System.out.print("Enter side: ");
                    square[0] = sc.nextDouble();

                    System.out.println("Area of Square = "
                            + squareArea(square));
                    break;

                case 5:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }

}
