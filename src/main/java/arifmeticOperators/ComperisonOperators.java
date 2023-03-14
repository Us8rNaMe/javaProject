package arifmeticOperators;

public class ComperisonOperators {
    public static void main(String[] args) {
        /*
        Comparison operators are used to compare 2 values:
        > more than
        < less than
        >= more or equal
        <= less or equal
        == equal
        != not equal
         */
    byte potato = 5;
    byte fries = 10;

    System.out.println(potato>fries);//false
    System.out.println(potato<fries);//true
    System.out.println(potato>=fries);//false
    System.out.println(potato<=fries);//true
    System.out.println(potato==fries);//false
    System.out.println(potato!=fries);//true


    byte apple =10;
    byte banana =11;
    short tree = 12;
    short grass = 13;
    int car = 14;
    int home =15;
    long number1 = 1000001;
    long number2 = 1000002;

    System.out.println(apple>banana);
    System.out.println(banana>tree);
    System.out.println(tree>grass);
    System.out.println(grass>car);
    System.out.println(car>home);
    System.out.println(home>number1);
    System.out.println(number1>number2);

    System.out.println(apple<banana);
    System.out.println(banana<tree);
    System.out.println(tree<grass);
    System.out.println(grass<car);
    System.out.println(car<home);
    System.out.println(home<number1);
    System.out.println(number1<number2);

    System.out.println(apple);
    boolean isEqual = (apple+tree)==car;
    System.out.println((apple+tree)==car);
    boolean iSNew = (number1>(banana+home));
    System.out.println(number1>(banana+home));
    boolean isNotPotato = (number2<(car-grass));
    System.out.println(number2<(car-grass));




    }
}
