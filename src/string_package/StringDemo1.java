
package string_package;


public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = "Hello";
        String s4 = " World";
        String s6 = "hello";
        String s5 = s1.concat(s4);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s6));
        System.out.println(s5);
        System.out.println(s5.contains(s1));
        System.out.println(s1.isEmpty());
        System.out.println(s1.equalsIgnoreCase(s6));
        System.out.println(s1.length());
        System.out.println(s3.toUpperCase());
        System.out.println(s3.toLowerCase());
        System.out.println(s1.startsWith("H"));
        System.out.println(s1.endsWith("o"));
    }
}
