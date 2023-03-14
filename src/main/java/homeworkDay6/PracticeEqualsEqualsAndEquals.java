package homeworkDay6;

public class PracticeEqualsEqualsAndEquals {
    public static void main(String[] args) {
        String hello1 = "Hello World!";
        String hello2 = "Hello world!";
        String hello3 = new String("HelloWorld!");
        System.out.println(hello1!=hello2);
        System.out.println(hello1==hello3);
        System.out.println(hello1==hello2);
        System.out.println(hello1.toLowerCase().equals(hello2.toLowerCase()));
        System.out.println(hello1.toUpperCase()==hello3.toUpperCase());



    }
}
