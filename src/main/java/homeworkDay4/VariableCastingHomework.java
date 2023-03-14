package homeworkDay4;

public class VariableCastingHomework {
    public static void main(String [] args){
        byte byteNew = 10;
        short shortNew = 5;
        int intNew = 9;
        long longNew = 454345L;
        float floatNew = 999.98F;
        double doubleNew = 121.121;
//======================BYTE======================
        byteNew = (byte) shortNew;
        System.out.println(byteNew);

        byteNew = (byte)intNew;
        System.out.println(byteNew);

        byteNew = (byte)longNew;
        System.out.println(byteNew);

        byteNew = (byte)floatNew;
        System.out.println(byteNew);

        byteNew = (byte)doubleNew;
        System.out.println(byteNew);

//======================SHORT======================

        shortNew = (short) byteNew;
        System.out.println(shortNew);

        shortNew = (short) intNew;
        System.out.println(shortNew);

        shortNew = (short) longNew;
        System.out.println(shortNew);

        shortNew = (short) floatNew;
        System.out.println(shortNew);

        shortNew = (short) doubleNew;
        System.out.println(shortNew);

//=======================INT========================

        intNew = (int) byteNew;
        System.out.println(intNew);

        intNew = (int) shortNew;
        System.out.println(intNew);

        intNew = (int) longNew;
        System.out.println(intNew);

        intNew = (int) floatNew;
        System.out.println(intNew);

        intNew = (int) doubleNew;
        System.out.println(intNew);

//========================LONG========================

        longNew = (long) byteNew;
        System.out.println(longNew);

        longNew = (long) shortNew;
        System.out.println(longNew);

        longNew = (long) intNew;
        System.out.println(longNew);

        longNew = (long) floatNew;
        System.out.println(longNew);

        longNew = (long) doubleNew;
        System.out.println(longNew);

//========================FLOAT========================

        floatNew = (float) byteNew;
        System.out.println(floatNew);

        floatNew = (float) shortNew;
        System.out.println(floatNew);

        floatNew = (float) intNew;
        System.out.println(floatNew);

        floatNew = (float) longNew;
        System.out.println(floatNew);

        floatNew = (float) doubleNew;
        System.out.println(floatNew);

//============================DOUBLE====================

        doubleNew = (double) byteNew;
        System.out.println(doubleNew);

        doubleNew = (double) shortNew;
        System.out.println(doubleNew);

        doubleNew = (double) intNew;
        System.out.println(doubleNew);

        doubleNew = (double) longNew;
        System.out.println(doubleNew);

        doubleNew =(double) floatNew;
        System.out.println(doubleNew);

    }
}
