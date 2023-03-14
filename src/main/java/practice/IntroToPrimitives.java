package practice;

public class IntroToPrimitives { public static void main (String [] args){

    int age = 27;
    int number = 100;

    System.out.println(age);
    System.out.println(number);

    age = 28;

//=================================================================

    byte myByte1 = 70; //declaring/creating variable
    byte myByte2 = -117;
    byte myByte3 = 127;
    byte myByte4 = -128;

    myByte1 = 50; //reassigning value
    System.out.println(myByte1); //100

    myByte1 = 40;
    System.out.println(myByte1);


    short iceCreamPerDay = 5000;
    short iceCreamPerWeek = 25000;
    //short iceCreamPerMonth = 100000; will not work, because more than 32000

    System.out.println(iceCreamPerDay);
    System.out.println(iceCreamPerWeek);

    int numOfFollowers = 1300;
    numOfFollowers = 300000;
    numOfFollowers = 2130000000;
    System.out.println(numOfFollowers); //

    long creditCard1 = 11112222333344444L;
    long creditCard2 = 2150000000l;

//====================================



}
}

