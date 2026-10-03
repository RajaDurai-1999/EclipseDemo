package Second;

public class StringFunction {
	public static void main(String[] args) {

        String str = "Hello Java";
        String app= "Hello Java";
        
        System.out.println(str==app);

        System.out.println(str.length());
        System.out.println(str.charAt(1));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.equals("Hello Java"));
        System.out.println(str.equalsIgnoreCase("HELLO JAVA"));
        System.out.println(str.contains("Java"));
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.endsWith("Java"));
        System.out.println(str.substring(6));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace("Java", "World"));
        System.out.println("  Raja  ".trim());
        System.out.println(str.concat(" Programming"));
      
    }

}
