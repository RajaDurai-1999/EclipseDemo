package EnumCl;

enum Status{
	Running,Pending,Failed,Success;
}

public class EnumPrg {

	public static void main(String[] args) {
		
		Status[] st=Status.values();
		for(Status s:st) {
			System.out.println(s);
		}
	}

}
