package ConstructorPgm;

public class ConstOverloading {
	
	String name;
	int age;
	
	ConstOverloading(){
		name="Unknown";
		age=0;
	}
	ConstOverloading(String name){
		this.name=name;
	}
	ConstOverloading(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	void display() {
		System.out.println("Name : "+name+" , "+"Age : "+age);
	}

	public static void main(String[] args) {
		
		ConstOverloading c=new ConstOverloading();
		ConstOverloading c1=new ConstOverloading("RajaDurai");
		ConstOverloading c2=new ConstOverloading("Durai",27);
		
		c.display();
		c1.display();
		c2.display();
		


	}

}
