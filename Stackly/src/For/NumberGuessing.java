package For;

import java.util.Scanner;

public class NumberGuessing {
	  public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int number = (int)(Math.random() * 10) + 1;
	        int guess;
	        int attempts;

	        for (attempts = 1; ; attempts++) {

	            System.out.print("Guess a number from 1 to 10: ");
	            guess = sc.nextInt();

	            if (guess == number) {
	                System.out.println("Correct");
	                System.out.println("Number of attempts: " + attempts);
	                break;
	            }
	            else if (guess > number) {
	                System.out.println("Too High!");
	            }
	            else {
	                System.out.println("Too Low!");
	            }
	        }

	        sc.close();

}
}
