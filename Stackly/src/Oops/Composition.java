package Oops;

class Room {

    void display() {
        System.out.println("This is a room");
    }
}

class House {
	String houseName;

    private Room room;

    House(String houseName) {
        room = new Room();
        this.houseName=houseName;
    }

    void displayHouse() {
    	    System.out.println("My house Name is "+houseName);
        System.out.println("This is a house");
        room.display();
    }
}

public class Composition {

    public static void main(String[] args) {

        House h = new House("Raja");

        h.displayHouse();
    }
}
