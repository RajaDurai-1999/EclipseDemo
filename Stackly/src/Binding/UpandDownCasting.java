package Binding;

public class UpandDownCasting {
	 public static void main(String[] args) {

	        // Upcasting
	        Animals a = new Dogs();

	        a.sound();
	       

	        // Downcasting
	        Dogs d = (Dogs) a;

	        d.sound();
	        d.bark();
	    }

}
class Animals {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dogs extends Animals {

    void bark() {
        System.out.println("Dog is barking");
    }
}
