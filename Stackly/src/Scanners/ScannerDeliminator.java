package Scanners;

import java.util.Scanner;

public class ScannerDeliminator {

	public static void main(String[] args) { 
//		Default Delimiter — Space
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("...........................................................");
		
		sc.useDelimiter("[ ,:/-]+");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("D = " + d);
        System.out.println("E = " + e);

        sc.close();

	}

}
