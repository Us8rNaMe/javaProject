package constructors;

public class SampleClass {


    /*
    Java reads from top to bottom, left to right

    1. static block will run the very first just once, even if
     */



    {
        System.out.println("Inside instance block");
    }

    static {
        System.out.println("Inside static block");
    }

    public SampleClass(){
        System.out.println("I am constructor");
    }

    public void instanceMethod(){
        System.out.println("Here is instance method");
    }

    public static void staticMethod(){
        System.out.println("This is static method");
    }

    public static void main(String[] args) {
        SampleClass sc = new SampleClass();
    }
}