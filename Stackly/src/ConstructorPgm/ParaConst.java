package ConstructorPgm;

public class ParaConst {
	String name;
	int age;
	
	ParaConst(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	void display() {
		System.out.println("Name : "+name+" , "+"Age : "+age);
	}

	public static void main(String[] args) {
		
		ParaConst p=new ParaConst("RajaDurai",30);
		
		p.display();
		
		

	}

}
