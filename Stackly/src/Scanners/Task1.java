package Scanners;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		String input = "94,Neyveli";

        Scanner sc = new Scanner(input);

        sc.useDelimiter(",");

        System.out.println(sc.nextInt());
        System.out.println(sc.next());

        sc.close();

	}

}
