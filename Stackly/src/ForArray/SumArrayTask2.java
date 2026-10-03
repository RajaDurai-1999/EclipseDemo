package ForArray;

import java.util.Scanner;

public class SumArrayTask2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size of Array");
		int n=sc.nextInt();
		
		int[]arr=new int[n];
		
		System.out.println("Enter Array elements");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum :"+sum);
		
		sc.close();
	}

}
