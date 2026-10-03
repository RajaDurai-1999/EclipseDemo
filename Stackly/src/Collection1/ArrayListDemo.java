package Collection1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	public static void main(String[] args) {
		
	ArrayList<Integer> numbers = new ArrayList<>();

    numbers.add(50);
    numbers.add(20);
    numbers.add(40);
    numbers.add(10);
    numbers.add(20);

    System.out.println("Original: " + numbers);

    numbers.add(2, 100);

    System.out.println("After add(index): " + numbers);

    System.out.println("get(1): " + numbers.get(1));

    numbers.set(1, 200);

    System.out.println("After set(): " + numbers);

    numbers.remove(2);

    System.out.println("After remove(index): "
            + numbers);


    System.out.println(
            "Contains 50: "
            + numbers.contains(50)
    );


    System.out.println(
            "Index of 20: "
            + numbers.indexOf(20)
    );

    System.out.println(
            "Last index of 20: "
            + numbers.lastIndexOf(20)
    );


    System.out.println(
            "Size: " + numbers.size()
    );
    
    System.out.println("........To find Max Value...............");
    
    int max=numbers.get(0);
    for(int i=0;i<numbers.size();i++) {
    	if(numbers.get(i)>max) {
    		max=numbers.get(i);
    	}
    }
    System.out.println("Maximum Number :"+max);
    
    System.out.println("...........To Reverse the List...........");
    
    for(int i=numbers.size()-1;i>=0;i--) {
    	System.out.println("Reverse List Order :"+numbers.get(i));
    }
    
    System.out.println("..........................Collections..........................");

    Collections.sort(numbers);

    System.out.println(
            "After sort(): " + numbers
    );


    Collections.reverse(numbers);

    System.out.println(
            "After reverse(): " + numbers
    );


    System.out.println(
            "Maximum: "
            + Collections.max(numbers)
    );

    System.out.println(
            "Minimum: "
            + Collections.min(numbers)
    );

    System.out.println(
            "Frequency of 20: "
            + Collections.frequency(numbers, 20)
    );


    Collections.swap(numbers, 0, 1);

    System.out.println(
            "After swap(): " + numbers
    );


    Collections.shuffle(numbers);

    System.out.println(
            "After shuffle(): " + numbers
    );


    numbers.clear();

    System.out.println(
            "After clear(): " + numbers
    );

    System.out.println(
            "Is Empty: " + numbers.isEmpty()
    );

}
}
