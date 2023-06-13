package constructors;

import java.util.Arrays;

public class IntroToConstructors {
    public IntroToConstructors(String name){

        System.out.println(name);
    }
    public IntroToConstructors(int [] array){

        System.out.println();
    }
    public IntroToConstructors(double [] array1){

        System.out.println(array1.length);
    }

    public static void main(String[] args) {
        IntroToConstructors intro1 = new IntroToConstructors("potato");
        IntroToConstructors intro2 = new IntroToConstructors(new int [] {12,123,123,31,23,12});
        IntroToConstructors intro3 = new IntroToConstructors(new double[] {123.2,341.1,123456,56754});

        System.out.println();
        System.out.println();
        System.out.println();


    }
}