package primitiveDataTypes;

public class IntroToPrimitives {
    public static void main(String [] args){

        int age = 27;
        int number = 475;
        int year = 2005;

        System.out.println(year);
        System.out.println(age);
        System.out.println(number);

        age = 28;

//======================================================================================================================

        byte myByte1 = 36; //declaring/creating variable
        byte myByte2 = -117;
        byte myByte3 = 127;
        byte myByte4 = -128;

        myByte1 = 13; //reasigning value
        System.out.println(myByte1); //100

        myByte2 = 40;
        System.out.println(myByte2);

        myByte3 = 17;
        System.out.println(myByte3);

        myByte4 = 0;
        System.out.println(myByte4);



        //short
        short iceCreamPerDay = 5000;
        short iceCreamPerWeak = 25000;

        System.out.println(iceCreamPerDay);
        System.out.println(iceCreamPerWeak);

        // int
        int numOfFollowers = 300000;
        int numOfSubscribes = 214000000;

        System.out.println(numOfSubscribes);
        System.out.println(numOfFollowers);

        //long
        long creditCard1 = 11112931942343422L;
        long creditCard2 = 324563462L;

        System.out.println(creditCard1);
        System.out.println(creditCard2);

    }
}
