package Collection1;

public class WrapperClass {
	    public static void main(String[] args) {

	        // Primitive
	        int a = 10;

	        // Boxing
	        Integer b = Integer.valueOf(a);

	        // Autoboxing
	        Integer c = a;

	        // Unboxing
	        int d = b.intValue();

	        // Auto-unboxing
	        int e = c;

	        // String to int
	        int f = Integer.parseInt("100");

	        // String to Integer
	        Integer g = Integer.valueOf("200");

	        // Integer to String
	        String h = g.toString();

	        // Character methods
	        char ch = 'A';

	        System.out.println(Character.isLetter(ch));
	        System.out.println(Character.isUpperCase(ch));
	        System.out.println("Primitive a: " + a);
	        System.out.println("Boxing b: " + b);
	        System.out.println("Autoboxing c: " + c);
	        System.out.println("Unboxing d: " + d);
	        System.out.println("Auto-unboxing e: " + e);
	        System.out.println("Parsed f: " + f);
	        System.out.println("ValueOf g: " + g);
	        System.out.println("String h: " + h);
	    }
	}


