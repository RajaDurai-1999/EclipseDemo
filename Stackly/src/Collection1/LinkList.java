package Collection1;

import java.util.LinkedList;

public class LinkList {

	    public static void main(String[] args) {

	        LinkedList<Integer> list = new LinkedList<>();

	        // Add
	        list.add(10);
	        list.add(20);
	        list.add(30);

	        // Add first
	        list.addFirst(5);

	        // Add last
	        list.addLast(40);

	        System.out.println("List: " + list);

	        // Get
	        System.out.println("First: " + list.getFirst());
	        System.out.println("Last: " + list.getLast());
	        System.out.println("Index 2: " + list.get(2));

	        // Set
	        list.set(2, 100);
	        System.out.println("After set: " + list);

	        // Contains
	        System.out.println("Contains 20: " + list.contains(20));

	        // Size
	        System.out.println("Size: " + list.size());

	        // Remove first
	        list.removeFirst();

	        // Remove last
	        list.removeLast();

	        System.out.println("After removing: " + list);

	        // Loop
	        for(Integer n : list) {
	            System.out.println(n);
	        }
	    }
	}


