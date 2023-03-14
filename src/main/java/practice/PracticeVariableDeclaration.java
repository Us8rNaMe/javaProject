package practice;

public class PracticeVariableDeclaration {
    public static void main (String [] args){

    byte myByte; //declared variable
    byte _another_byte;

    myByte = 5;
    myByte = 10;

    System.out.println(myByte); //10

    myByte = 20;

    System.out.println(myByte); //20

    _another_byte = 100;

    System.out.println(_another_byte);


    //------------------------------------------------------

        /*
        create 5 short variables
        assign values, reassign values twice
        print them

        short sh1;
        sh1 = 10
        print()
        sh1 = 20;
        print

        short sh2 = 9;
        print
        sh2 = 10;

         */

    short myShort = 5;
    myShort = 3;


//============================================

    int myInt1; //created variable and didint give any value
    int myInt2;

    myInt1 = 3131313;
    myInt1 = 200;

    myInt2 = myInt1;

    System.out.println(myInt1);
    System.out.println(myInt2);

    int myInt3 = 40;
//        ==============================

        /*
        -2,147,483,648  to 2 147 000 000 RANGE OF INTEGER
         */

    long longNumber1 = 1;
    longNumber1 = -2000;

    long longNumber2 = -2147483649L;
    long longNumber3 = 2147483648L;

    longNumber2 = myInt3; //40
    System.out.println(longNumber2);


    byte byteNumber = 0;
    short shortNumber = 0;
    int intNumber = 0;
    long longNumber = 425245;

    // CASTING - is used to store larger variable values into smaller variable values


    intNumber = (int)longNumber;
    System.out.println(intNumber);

    // byte stores -128 to 127

    intNumber = 200;
    byteNumber = (byte)intNumber;
    System.out.println(byteNumber); //200


    //short stores -32768 to 32767
    byteNumber = 30;
    shortNumber = byteNumber;
    System.out.println(shortNumber); //30

    longNumber = 200;
    shortNumber = (byte)longNumber;
    System.out.println(shortNumber); //20

}
}
