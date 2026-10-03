package EnumCl;

enum Status1{
	Running,Pending,Failed,Success;
}

public class EnumPrg2 {

	public static void main(String[] args) {
		Status1 s=Status1.Pending;
		System.out.println(s);
		Status1 s1=Status1.valueOf("Success");
		System.out.println(s1);
		System.out.println(s.ordinal());
		System.out.println(s1.ordinal());
		System.out.println(s1.getClass());
		System.out.println(s1.getDeclaringClass());
		

	}

}
