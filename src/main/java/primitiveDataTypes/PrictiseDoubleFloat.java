package primitiveDataTypes;

public class PrictiseDoubleFloat {
    public static void main(String [] args){
        /*
        - float and double are variables that store decimal numbers
        - double is larger than float
        - double is the most precise variable
        - Java thinks that all decimal numbers are double
        - to make sure float is float put F/f in the end
        - both double and float can store whole numbers
         */

        double priceOfBread = 4.99;
        double priceOfApples = 3.995554444444444444444444444444465556565656;
        System.out.println(priceOfApples);

        priceOfBread = 1000000000012.34567891011121314151617181920;
        System.out.println(priceOfBread);

        byte byte1 = 2;
        short short1 = 5;
        int int1 = 7;
        long long1 =345;
        float float1 = 3546;
        double double1= 2343;

        float1 = (float)double1;

        double1 = float1;

        float1 = int1;

        double1 = 4.99;
        long1 = (long)double1;

        System.out.println(long1);

        /*create 10 double , create 10 floats
        assign values, reasign values,
        do casting
         */
        //================= java is good =================================

        /*
        4.88 - floating, fractinoal, decimal numbers
        1, 2, 3 - whole numbers
        1234567890 - decimal system
        12345678 - hexadecimal system
        01234567 - octal system
        0123456789abcdef - hexadecimal
        10 - binary system
        */

        int a =5;
        double d = 8.5;

        a = (int)d;

        System.out.println(a); //8

        short sh;
        float f = (float) 12.7F;
        f = 12.7F;

        sh = (short)f;
        System.out.println(sh);

        double price = 2.5;

        /*
        byte - microwave
        short - fridge
        int - room
        long - apartment
        float - house
        double mall
         */

    }
}
