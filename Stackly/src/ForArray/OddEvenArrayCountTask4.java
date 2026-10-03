package ForArray;

import java.util.Scanner;

public class OddEvenArrayCountTask4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size of Array");
		
		int n=sc.nextInt();
		
		int[]arr=new int[n];
		
		System.out.println("Enter Array Elements");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int oddCount=0;
		int evenCount=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		
		System.out.println("EvenCount :"+evenCount);
		System.out.println("OddCount :"+oddCount);
		
		sc.close();
	}

}
