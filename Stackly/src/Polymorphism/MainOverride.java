package Polymorphism;


public class MainOverride {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
    }
}
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}


