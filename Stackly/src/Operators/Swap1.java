package Operators;

public class Swap1 {

	public static void main(String[] args) {
		    int a = 10;
	        int b = 20;


	        a = a + b; 
	        
	        b = a - b;
	        
	        a = a - b;

	        System.out.println("a = " + a);
	        System.out.println("b = " + b);
	        
	        int x=10;
	        int y=++x;
	        
	        System.out.println("PreIncrement: x= "+x);
	        System.out.println("PreIncrement: y= "+y);
	        
	        int c=12;
	        int d=c++;
	        
	        System.out.println("PostIncrement: c= "+c);
	        System.out.println("PostIncrement: d= "+d);
	        
	        

	        
	}

}
