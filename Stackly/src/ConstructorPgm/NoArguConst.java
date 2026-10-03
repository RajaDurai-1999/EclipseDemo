package ConstructorPgm;

public class NoArguConst {
	
	String name;
	int age;
	
	public NoArguConst() {
		name="Raja";
		age=27;
	}
	void display() {
		System.out.println(name+" "+age);
	}

	public static void main(String[] args) {
		
		NoArguConst n=new NoArguConst();
		
		n.display();

	}

}
