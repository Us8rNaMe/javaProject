package scanner;

import java.util.Scanner;

public class IntroToScaner {
    public static void main(String[] args) {
        Scanner potato = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = potato.nextInt();

        System.out.println("Enter second number");
        int num2 = potato.nextInt();

        System.out.println("Enter third number");
        int num3 = potato.nextInt();

        System.out.println("The sum is: "+(num1+num2+num3));


    }
}
