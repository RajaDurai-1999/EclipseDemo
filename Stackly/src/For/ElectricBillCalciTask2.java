package For;

import java.util.Scanner;

public class ElectricBillCalciTask2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		double rate=5;
		double totalBill=0;
		
		for(int i=1;i<=6;i++) {
			System.out.println("Enter units for month"+i+" : ");
			int units=sc.nextInt();
			
			double bill=units*rate;
			
			System.out.println("Month"+i+"bill = "+bill);
			totalBill=totalBill+bill;
		}
		System.out.println("Total bill for 6 months ="+totalBill);

	}

}
