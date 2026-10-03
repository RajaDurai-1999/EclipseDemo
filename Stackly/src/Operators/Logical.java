package Operators;

public class Logical {

	public static void main(String[] args) {
		
		 int age = 25;

	        System.out.println("AND: " + (age >= 18 && age <= 60));
	        System.out.println("OR: " + (age < 18 || age > 60));
	        System.out.println("NOT: " + !(age >= 18));

	}

}
