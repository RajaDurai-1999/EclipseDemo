package ForArray;

import java.util.Scanner;

public class SearchNumTask5 {
	public static void main (String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int n=sc.nextInt();
		
		int[]arr=new int[n];
		
		System.out.println("Enter Array element ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter number to search");
		
		int search=sc.nextInt();
		
		int index=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]==search) {
				index=i;
				break;
			}
		}
		
		if(index !=-1) {
			System.out.println("Matched Number Index :"+index);
		}
		else {
			System.out.println("Not Found");
		}
		sc.close();
		
		
	}

}
