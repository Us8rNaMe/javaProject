package arifmeticOperators;

public class AssignedEqualOperators {
    public static void main(String[] args) {
    /*

     = - assigned operator (when you give value to variable)

     == - equal operator (compares two variables if they are equal or not)

     != - not equal operator (compares if two variables are not equal)

     */

        int number1 = 10; //assignment
        int number2 = 8;

        System.out.println(number1 == number2); //false
        System.out.println(100 == 100);//true

        boolean isEqual = 100 == 100 + 1;
        System.out.println(isEqual);
        boolean isEven;// if number can be divided by 2

        isEven = 80 % 2 == 0;//true



        System.out.println(30%7!=0);








    };
}
