package Second;

public class StringBufferAndBuilder {
	public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");
        
        sb.append(" Java");
        System.out.println("append(): " + sb);

        sb.insert(5, " World");
        System.out.println("insert(): " + sb);
        
        sb.replace(6, 11, "India");
        System.out.println("replace(): " + sb);

        sb.delete(5, 11);
        System.out.println("delete(): " + sb);

        sb.deleteCharAt(0);
        System.out.println("deleteCharAt(): " + sb);

        System.out.println("charAt(): " + sb.charAt(1));
        
        sb.setCharAt(0, 'J');
        System.out.println("setCharAt(): " + sb);

        System.out.println("length(): " + sb.length());

        System.out.println("capacity(): " + sb.capacity());

        System.out.println("substring(): " + sb.substring(1));

        System.out.println("indexOf(): " + sb.indexOf("Java"));

        System.out.println("lastIndexOf(): " + sb.lastIndexOf("a"));

        sb.reverse();
        System.out.println("reverse(): " + sb);

        String str = sb.toString();
        System.out.println("toString(): " + str);



        StringBuilder builder = new StringBuilder("Hello");

        builder.append(" Java");

        builder.insert(5, " World");

        builder.replace(6, 11, "India");

        builder.delete(5, 11);

        builder.deleteCharAt(0);

        builder.setCharAt(0, 'J');

        builder.reverse();

        System.out.println("StringBuilder: " + builder);
    }

}
