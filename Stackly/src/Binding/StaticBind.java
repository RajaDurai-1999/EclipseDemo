package Binding;

public class StaticBind {
	 public static void main(String[] args) {

	        Parent p = new Child();

	        p.show();
	    }

}

class Parent {

    static void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    static void show() {
        System.out.println("Child");
    }
}