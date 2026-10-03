package For;

public class OddEvenCountTask3 {

	public static void main(String[] args) {
		
		int oddCount=0;
		int evenCount=0;
		
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		System.out.println("Even Count :"+evenCount);
		System.out.println("Odd Count :"+oddCount);

	}

}
