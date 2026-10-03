package Collection1;

import java.util.Stack;
import java.util.Vector;

public class VectorandStack {

	    public static void main(String[] args) {

	        Vector<String> names = new Vector<>();

	        names.add("Raja");
	        names.add("Bala");
	        names.add("Kumar");

	        System.out.println("Vector: " + names);

	        names.addFirst("Arun");
	        names.addLast("Siva");

	        System.out.println("After adding: " + names);

	        System.out.println("First: " + names.firstElement());
	        System.out.println("Last: " + names.lastElement());

	        System.out.println("Element at index 2: " + names.get(2));

	        names.set(1, "Mani");

	        System.out.println("After set: " + names);

	        System.out.println("Size: " + names.size());
	        System.out.println("Capacity: " + names.capacity());

	        System.out.println("Contains Raja: " + names.contains("Raja"));

	        names.remove("Kumar");

	        System.out.println("After remove: " + names);
	        
	        System.out.println(".........Vector.............");
	        
	        Stack<Integer> stack = new Stack<>();

	        // Push
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.push(40);

	        System.out.println("Stack: " + stack);

	        // Peek
	        System.out.println("Top element: " + stack.peek());

	        // Search
	        System.out.println("Position of 20: " + stack.search(20));

	        // Pop
	        System.out.println("Removed: " + stack.pop());

	        System.out.println("After pop: " + stack);

	        // Empty
	        System.out.println("Is empty: " + stack.empty());

	        // Size
	        System.out.println("Size: " + stack.size());
	    }
	}

