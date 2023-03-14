package primitiveDataTypes;

public class PractiseVariableDeclaration {
    public static void main(String [] args){
        /*
           1. Declare variable (means create container)
           2. Assign value to variable (put value inside variable)
           3. Reassign value to variable (put new value to the same variable)
        -----------------------
        Variable Declaration

        byte myByte;
        short myShort;
        int myInt;
        long myLong;
        ------------------------
        Naming Convention:
        - All variables must start lower case
        - All variables must use camelCase (this_Is_My_Camel_Case_Long_Word)
        - All classes must start with upper case,use camelCase
        - All packages must start with lower case, use camelCase
        - Names must start with any letter, or _ or $
        ------------------------
        Value Assignment
        byte myByte =3; (declare variable and assign value)

        short age; (declaring variable)
        age = 40; (assigned value to variable)
        ------------------------
        Reassign Value

        int number = 100;
        number = 30; (reassign value)
        number = 0;

        */
        // single line comment
        byte myByte; //declared varriable
        byte _another_byte;

        myByte =5;
        _another_byte =10;
        myByte = 10;
        System.out.println(myByte);//10

        myByte =20;
        System.out.println(myByte);//20

        _another_byte =100;
        System.out.println(_another_byte);

        //---------------------------------------------------------
        /*
        create 5 short variables
        assign values, reassign values twice
        print then

        short sh1;
        sh1 =10
        print()
         */

        // short short short short short

        short sh1;
        sh1 =10;
        System.out.println(sh1);
        sh1 =20;
        System.out.println(sh1);
        short potato;
        potato =11;
        System.out.println(potato);
        potato = 8;
        System.out.println(potato);
        short car;
        car = 3;
        System.out.println(car);
        car = 5;
        System.out.println(car);
        short time;
        time = 2020;
        System.out.println(time);
        time = 2021;
        System.out.println(time);
        short abc;
        abc = 100;
        System.out.println(abc);
        abc = 200;
        System.out.println(abc);

        // int int int int int int int int

        int potatoes = 10000;
        System.out.println(potatoes);
        potatoes = 10001;
        System.out.println(potatoes);
        int pepsicola = 5;
        System.out.println(pepsicola);
        pepsicola = 10;
        System.out.println(pepsicola);
        int pasta =17;
        System.out.println(pasta);
        pasta = 18;
        System.out.println(pasta);
        int spaceship = 100000000;
        System.out.println(spaceship);
        spaceship = 2000000;
        System.out.println(spaceship);
        int phone = 1;
        System.out.println(phone);
        phone =2;
        System.out.println(phone);
        int cat = 2000342;
        System.out.println(cat);
        cat = 63627;
        System.out.println(cat);
        int tomato = 88888;
        System.out.println(tomato);
        tomato = 99999;
        System.out.println(tomato);
        int number = 0;
        System.out.println(number);
        number = 1;
        System.out.println(number);
        int salsa = 2;
        System.out.println(salsa);
        salsa = 3;
        System.out.println(salsa);
        int ball = 4;
        System.out.println(ball);
        ball = 5;
        System.out.println(ball);

        //long long long long long long

        long longNumber1 = 1;
        System.out.println(longNumber1);
        longNumber1 = -323232;
        System.out.println(longNumber1);
        long longNumber2 = 23232323232323L;
        System.out.println(longNumber2);
        longNumber2 = -23232323232323L;
        System.out.println(longNumber2);
        long longNumber3 = number;
        System.out.println(number); //1
        longNumber3 = potatoes;
        System.out.println(potatoes);// 10001

     byte byteNumber = 10;
     short shortNumber = 2;
     int intNumber = 40;
     long longNumber = 30;

        longNumber = byteNumber;    // longNumber its a cup , byteNumber its a water

        //short stores -32768 to 32767
        byteNumber = 30;
        shortNumber = byteNumber;
        System.out.println(shortNumber); //30

        longNumber = 20;
        shortNumber = (byte)longNumber;
        System.out.println(shortNumber); //20
    }
}
