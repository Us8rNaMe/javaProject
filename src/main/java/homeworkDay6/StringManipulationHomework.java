package homeworkDay6;

public class StringManipulationHomework {
    public static void main(String[] args) {

        String str = "Hello everyone, Let's do Java String exercises";
        int a = 10;
        char b = str.charAt(a);
        System.out.println("The character at position 10 is "+b);
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.toLowerCase().charAt(0));
        System.out.println(str.toUpperCase().charAt(str.length()-1));


    }
}
